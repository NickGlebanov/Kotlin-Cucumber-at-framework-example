package features

import io.cucumber.testng.AbstractTestNGCucumberTests
import io.cucumber.testng.CucumberOptions
import org.testng.annotations.DataProvider


@CucumberOptions(
        features = ["src/test/resources/features"],
        glue = ["com.nglebanov.selatstar.stepdefs"]
)
class Runner : AbstractTestNGCucumberTests() {

    @DataProvider(parallel = true)
    override fun scenarios(): Array<Array<Any?>?>? {
        return super.scenarios()
    }
}