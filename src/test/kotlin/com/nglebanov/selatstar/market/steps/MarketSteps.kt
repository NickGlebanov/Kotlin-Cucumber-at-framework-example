package com.nglebanov.selatstar.market.steps

import com.codeborne.selenide.Selenide
import com.nglebanov.selatstar.core.base.BaseSteps
import com.nglebanov.selatstar.market.elements.MarketElements

class MarketSteps(private val marketElements: MarketElements) : BaseSteps() {

    init {

        And("^open market$") {
            Selenide.open("https://market.yandex.ru/catalog--noutbuki/54544/list?hid=91013&local-offers-first=0&onstock=1")
        }

        And("^example market step$") {
            marketElements.apply {

                filter("Цена, ₽").apply {
                    numberFieldFrom().value = "1400"
                    numberFieldTo().value = "9000"
                    radio("С учётом самовывоза").click()
                }

                filter("Производитель").checkbox("Acer").click()

                filter("Тип").checkbox("игровой ноутбук").click()
            }
        }
    }
}