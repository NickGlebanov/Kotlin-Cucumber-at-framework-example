package com.nglebanov.selatstar.core.runner

import com.codeborne.selenide.Selenide
import io.cucumber.testng.CucumberOptions
import io.cucumber.testng.FeatureWrapper
import io.cucumber.testng.PickleWrapper
import io.cucumber.testng.TestNGCucumberRunner
import org.testng.annotations.*


@CucumberOptions(
        features = ["src/test/resources/features"],
        glue = ["com.nglebanov.selatstar.core.stepdefs", "com.nglebanov.selatstar.market.steps"],
        strict = true
)
class CucumberSelenideRunner {
    private var testNGCucumberRunner: TestNGCucumberRunner? = null

    @BeforeClass(alwaysRun = true)
    fun setUpClass() {
        testNGCucumberRunner = TestNGCucumberRunner(this.javaClass)
    }

    @DataProvider(parallel = true)
    fun scenarios(): Array<Array<Any?>?>? {
        return testNGCucumberRunner!!.provideScenarios()
    }

    @Test(groups = ["cucumber scenarios"], description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    fun runScenario(pickleEvent: PickleWrapper, cucumberFeatureWrapper: FeatureWrapper) {
        testNGCucumberRunner!!.runScenario(pickleEvent.pickle)
    }

    @BeforeMethod
    fun prepareDriver() {
        println("preparing driver")
        Selenide.open("https://yandex.ru/")
    }

    @AfterClass(alwaysRun = true)
    @Throws(java.lang.Exception::class)
    fun tearDownClass() {
        testNGCucumberRunner!!.finish()
    }

}