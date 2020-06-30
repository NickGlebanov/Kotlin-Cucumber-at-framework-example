package com.nglebanov.selatstar.core.proxy

import net.lightbody.bmp.BrowserMobProxy
import net.lightbody.bmp.BrowserMobProxyServer


class BrowserMobProxyService {

    private lateinit var proxy: BrowserMobProxy

    fun start() {
        proxy = BrowserMobProxyServer()
        proxy.start(0)
        println("proxy launched")
    }

    fun stop() {
        proxy.stop()
    }

    fun getBrowserMob(): BrowserMobProxy {
        return proxy
    }
}