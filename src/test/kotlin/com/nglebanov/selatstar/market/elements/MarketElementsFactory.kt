package com.nglebanov.selatstar.market.elements

import com.codeborne.selenide.SelenideElement
import com.nglebanov.selatstar.core.base.BaseElementsFactory
import org.springframework.stereotype.Component


@Component
class MarketElementsFactory : BaseElementsFactory() {

    fun filter(filterName: String): Filter {
        return Filter(name = filterName)
    }

    fun sort(sortName: String): SelenideElement {
        return S("*[data-autotest-id = dprice]")
    }

}