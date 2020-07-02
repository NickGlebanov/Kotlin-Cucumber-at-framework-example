package com.nglebanov.selatstar.core.techsteps

import com.codeborne.selenide.WebDriverRunner
import com.nglebanov.selatstar.core.base.BaseSteps
import com.nglebanov.selatstar.core.context.ThreadContext
import com.nglebanov.selatstar.core.helpers.OSHelper
import com.nglebanov.selatstar.core.proxy.BrowserMobProxyService
import net.lightbody.bmp.client.ClientUtil
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.springframework.beans.factory.annotation.Autowired

class StartBrowserSteps(
        @Autowired threadContext: ThreadContext
) : BaseSteps() {

    private lateinit var browserMobProxyService: BrowserMobProxyService

    init {

        When("^настраиваем драйвер с прокси$") {
            var chromeDriverName : String? = null
            OSHelper.ifWindows { chromeDriverName = "chromedriver.exe" }
            OSHelper.ifMac { chromeDriverName = "chromedriver" }
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/$chromeDriverName")
            var opts = ChromeOptions()
            opts.addArguments("--disable-web-security")
            opts.addArguments("--allow-running-insecure-content")
            opts.addArguments("--ignore-certificate-errors")
            browserMobProxyService = threadContext.getBrowserMobService()
            val browserMob = browserMobProxyService.getBrowserMob()
            val seleniumProxy = ClientUtil.createSeleniumProxy(browserMob)
            OSHelper.ifMac {
                seleniumProxy.httpProxy = "localhost:"+ browserMob.port
                seleniumProxy.sslProxy = "localhost:"+ browserMob.port
            }
            opts.setCapability(CapabilityType.PROXY, seleniumProxy)
            val driver = ChromeDriver(opts)
            WebDriverRunner.setWebDriver(driver)
            browserMobProxyService.createHar()
        }
    }

}