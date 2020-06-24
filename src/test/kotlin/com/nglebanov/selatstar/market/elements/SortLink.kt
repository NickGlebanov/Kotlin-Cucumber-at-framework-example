package com.nglebanov.selatstar.market.elements

import com.nglebanov.selatstar.core.base.BaseElementsFactory
import com.nglebanov.selatstar.core.base.UiElement
import io.qameta.allure.Allure

class SortLink(private val allureName: String, sortName: String) : UiElement {

    private val baseCss = "*[data-autotest-id = $sortName]"

    fun click() {
        Allure.step("Кликнули по сортировке: $allureName")
        BaseElementsFactory.S(baseCss).click()
    }

}