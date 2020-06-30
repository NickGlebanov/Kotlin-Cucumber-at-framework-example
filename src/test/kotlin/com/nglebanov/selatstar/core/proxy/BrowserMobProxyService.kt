package com.nglebanov.selatstar.core.proxy

import net.lightbody.bmp.BrowserMobProxy
import net.lightbody.bmp.BrowserMobProxyServer
import net.lightbody.bmp.core.har.Har
import java.util.*


class BrowserMobProxyService {

    private lateinit var proxy: BrowserMobProxy

    fun start() {
        proxy = BrowserMobProxyServer()
        proxy.start(0)
    }

    fun stop() {
        proxy.stop()
    }

    fun getBrowserMob(): BrowserMobProxy {
        return proxy
    }

    fun createHar() {
        proxy.newHar("yandex ${UUID.randomUUID()}")
    }

    fun getHar(): Har {
        return proxy.har
    }
}