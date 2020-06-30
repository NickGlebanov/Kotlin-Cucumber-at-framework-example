package com.nglebanov.selatstar.core.hooks

import com.nglebanov.selatstar.core.context.ThreadContext
import io.cucumber.java.After
import io.cucumber.java.Before
import org.springframework.beans.factory.annotation.Autowired

class CucumberHooks {

    @Autowired
    private lateinit var threadContext: ThreadContext

    @Before
    fun beforeScenario() {
        threadContext.refreshThreadContext()
        threadContext.getBrowserMobService().start()
        println("before")
    }

    @After
    fun afterScenario() {
        threadContext.getBrowserMobService().stop()
        println("after")
    }

}