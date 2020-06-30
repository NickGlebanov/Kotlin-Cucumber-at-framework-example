package com.nglebanov.selatstar.core.techsteps

import com.codeborne.selenide.WebDriverRunner
import com.nglebanov.selatstar.core.base.BaseSteps
import com.nglebanov.selatstar.core.context.ThreadContext
import net.lightbody.bmp.client.ClientUtil
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.springframework.beans.factory.annotation.Autowired

class StartBrowserSteps(
        @Autowired threadContext: ThreadContext
) : BaseSteps() {

    init {

        When("^настраиваем драйвер с прокси$") {
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe")
            var opts = ChromeOptions()
            opts.setCapability(CapabilityType.PROXY,
                    ClientUtil.createSeleniumProxy(threadContext.getBrowserMobService().getBrowserMob()))
            val driver = ChromeDriver(opts)
            WebDriverRunner.setWebDriver(driver)
        }
    }

}