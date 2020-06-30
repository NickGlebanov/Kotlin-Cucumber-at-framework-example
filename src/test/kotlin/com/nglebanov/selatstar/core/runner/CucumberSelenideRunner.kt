package com.nglebanov.selatstar.core.runner

import io.cucumber.testng.CucumberOptions
import io.cucumber.testng.FeatureWrapper
import io.cucumber.testng.PickleWrapper
import io.cucumber.testng.TestNGCucumberRunner
import org.springframework.boot.test.context.SpringBootTest
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

@SpringBootTest
@CucumberOptions(
        features = ["src/test/resources/features"],
        glue = ["com.nglebanov.selatstar.market.steps", "com.nglebanov.selatstar.core.hooks"
            , "com.nglebanov.selatstar.core.techsteps"],
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

    @AfterClass(alwaysRun = true)
    @Throws(java.lang.Exception::class)
    fun tearDownClass() {
        testNGCucumberRunner!!.finish()
        println("allure starting...")
        val projectPath = "${System.getProperty("user.dir")}\\target\\allure-results"
        Runtime.getRuntime().exec("${System.getProperty("user.dir")}\\allure-2.13.3\\bin\\allure.bat serve $projectPath")
    }

}