package com.nglebanov.selatstar.market.elements

import com.codeborne.selenide.SelenideElement
import com.nglebanov.selatstar.core.base.BaseElement
import com.nglebanov.selatstar.core.base.BaseElements

class Filter(private val name: String)
    : BaseElement(baseXpath = "//div[@class='search-layout']//*[text()='$name']/..") {

    fun numberFieldFrom(): SelenideElement {
        return BaseElements.SX("$baseXpath//input[contains(@id,'from')]")
    }

    fun numberFieldTo(): SelenideElement {
        return BaseElements.SX("$baseXpath//input[contains(@id,'to')]")
    }

    fun radio(text: String): SelenideElement {
        return BaseElements.SX("$baseXpath//span[text()='$text']/..")
    }

    fun checkbox(text: String): SelenideElement {
        return BaseElements.SX("$baseXpath//span[text()='$text']/..")
    }

    fun color(text: String): SelenideElement {
        return BaseElements.SX("$baseXpath//span[text()='$text']/..")
    }
}