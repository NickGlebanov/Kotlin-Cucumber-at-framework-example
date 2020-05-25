package com.nglebanov.selatstar.core.context

import org.springframework.stereotype.Component

@Component
class ThreadContext {

    private val threadContext: MutableMap<Long, TestContext> = mutableMapOf()

    fun refreshThreadContext() {
        threadContext[Thread.currentThread().id] = TestContext()
    }

    fun getTestContext(): TestContext {
        return threadContext[Thread.currentThread().id]!!
    }
}