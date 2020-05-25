package com.nglebanov.selatstar.market.elements

import com.nglebanov.selatstar.core.base.BaseElements
import org.springframework.stereotype.Component


@Component
class MarketElements : BaseElements() {

    fun filter(filterName: String): Filter {
        return Filter(name = filterName)
    }

}