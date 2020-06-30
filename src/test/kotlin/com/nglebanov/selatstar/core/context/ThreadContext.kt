package com.nglebanov.selatstar.core.context

import com.nglebanov.selatstar.core.proxy.BrowserMobProxyService
import org.springframework.stereotype.Component

@Component
class ThreadContext {

    private val threadContext: MutableMap<Long, TestContext> = mutableMapOf()
    private val proxyContext: MutableMap<Long, BrowserMobProxyService> = mutableMapOf()

    fun refreshThreadContext() {
        threadContext[Thread.currentThread().id] = TestContext()
        proxyContext[Thread.currentThread().id] = BrowserMobProxyService()
    }

    fun getTestContext(): TestContext {
        return threadContext[Thread.currentThread().id]!!
    }

    fun getBrowserMobService(): BrowserMobProxyService {
        return proxyContext[Thread.currentThread().id]!!
    }
}