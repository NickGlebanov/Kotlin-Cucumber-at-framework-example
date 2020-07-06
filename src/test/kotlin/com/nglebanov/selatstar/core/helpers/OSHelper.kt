package com.nglebanov.selatstar.core.helpers

class OSHelper {

    companion object {

        fun ifWindows(func: () -> Unit) {
            val currentSystem = System.getProperty("os.name")
            if (currentSystem.startsWith("Windows")) {
                func()
            }
        }

        fun ifMac(func: () -> Unit) {
            val currentSystem = System.getProperty("os.name")
            if (currentSystem.startsWith("Mac")) {
                func()
            }
        }
    }

}