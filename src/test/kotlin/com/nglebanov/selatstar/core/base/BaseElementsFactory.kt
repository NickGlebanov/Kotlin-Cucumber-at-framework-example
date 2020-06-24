package com.nglebanov.selatstar.core.base

import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement

abstract class BaseElementsFactory {

    companion object {

        fun SS(css: String): ElementsCollection {
            return Selenide.`$$`(css)
        }

        fun S(css: String): SelenideElement {
            return Selenide.`$`(css)
        }

        fun SSX(xpath: String): ElementsCollection {
            return Selenide.`$$x`(xpath)
        }

        fun SX(xpath: String): SelenideElement {
            return Selenide.`$x`(xpath)
        }

    }

}