package com.nglebanov.selatstar.core.stepdefs

import com.codeborne.selenide.Selenide
import com.nglebanov.selatstar.SelatstarApplication
import com.nglebanov.selatstar.TestConfig
import com.nglebanov.selatstar.core.base.BaseSteps
import com.nglebanov.selatstar.core.context.ThreadContext
import org.apache.commons.lang3.RandomStringUtils
import org.assertj.core.api.Assertions.assertThat
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [SelatstarApplication::class, TestConfig::class])
class ExampleSteps(@Autowired private val context: ThreadContext) : BaseSteps() {

    private val LOG: Logger = LoggerFactory.getLogger(ExampleSteps::class.java.name)


    init {
        When("^test started$") {
            context.refreshThreadContext()
            println(Thread.currentThread().id)
        }

        Then("^assert 1 == 1$") {
            assertThat(1).isEqualTo(1)
        }

        And("^put random value to context$") {
            context.getTestContext().addValueToContextByKey(
                    RandomStringUtils.randomAlphabetic(5), RandomStringUtils.randomAlphabetic(5))
        }

        And("^wait$") {
            Selenide.sleep(1000)
        }

        And("show context") {
            context.getTestContext().show()
        }
    }
}