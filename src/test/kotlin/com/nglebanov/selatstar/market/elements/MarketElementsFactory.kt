package com.nglebanov.selatstar.market.elements

import com.nglebanov.selatstar.core.base.BaseElementsFactory
import org.springframework.stereotype.Component


@Component
class MarketElementsFactory : BaseElementsFactory() {

    fun filter(filterName: String): Filter {
        return Filter(name = filterName)
    }

    fun sort(allureName: String, sortName: String): SortLink {
        return SortLink(allureName, sortName)
    }

}