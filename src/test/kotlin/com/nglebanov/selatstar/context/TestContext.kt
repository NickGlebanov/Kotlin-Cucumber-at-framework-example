package com.nglebanov.selatstar.context

import org.springframework.stereotype.Component

@Component
class TestContext {

    private val map: MutableMap<String, String> = mutableMapOf()

    fun addValueToContextByKey(key: String, value: String) {
        map.put(key, value)
        println("added to context $key = $value")
    }

    fun getValueFromContextByKey(key: String): String {
        println("finding value by key = $key in context")
        return map.get(key)!!
    }

    fun show() {
        map.forEach { println("${it.key} = ${it.value}") }
    }
}