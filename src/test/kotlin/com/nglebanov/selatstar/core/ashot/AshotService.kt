package com.nglebanov.selatstar.core.ashot

import com.codeborne.selenide.WebDriverRunner
import org.openqa.selenium.JavascriptExecutor
import org.springframework.stereotype.Component
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.shooting.ShootingStrategies
import java.io.File
import javax.imageio.ImageIO

@Component
class AshotService {

    private val ashot = AShot()

    fun hideScrollbar() {
        (WebDriverRunner.getWebDriver() as JavascriptExecutor).executeScript("document.body.style.overflow = 'hidden';")
    }

    fun takeEtalonScreenshotAndSave(screenName: String) {
        val screenshot = ashot
                .shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(WebDriverRunner.getWebDriver())
        ImageIO.write(screenshot.image, "PNG", File("./screenshots/$screenName.png"))
    }


}