package com.nglebanov.selatstar.core.context

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class TestContext {

    var logger: Logger = LoggerFactory.getLogger(TestContext::class.java)

    private val map: MutableMap<String, String> = mutableMapOf()

    fun addValueToContextByKey(key: String, value: String) {
        map.put(key, value)
        logger.info("added to context $key = $value")
    }

    fun getValueFromContextByKey(key: String): String {
        logger.info("finding value by key = $key in context")
        return map.get(key)!!
    }

    fun show() {
        logger.info("current test context:")
        map.forEach { println("${it.key} = ${it.value}") }
    }
}