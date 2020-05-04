package com.nglebanov.selatstar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SelatstarApplication {

    companion object {
        fun aspectExample() {
            println("hello aspect")
        }
    }

}

fun main(args: Array<String>) {
    runApplication<SelatstarApplication>(*args)
}
