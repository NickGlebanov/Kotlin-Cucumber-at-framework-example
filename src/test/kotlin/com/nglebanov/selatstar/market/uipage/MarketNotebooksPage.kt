package com.nglebanov.selatstar.market.uipage

import com.nglebanov.selatstar.market.elements.MarketElementsFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MarketNotebooksPage {

    @Autowired
    lateinit var marketElementsFactory: MarketElementsFactory
    val url = "https://market.yandex.ru/catalog--noutbuki/54544/list?hid=91013&local-offers-first=0&onstock=1"

    inner class Filters {
        val производитель = marketElementsFactory.filter("Производитель")
        val цена = marketElementsFactory.filter("Цена, ₽")
        val тип = marketElementsFactory.filter("Тип")
        val размерЭкрана = marketElementsFactory.filter("Размер экрана")
        val разрешениеЭкрана = marketElementsFactory.filter("Разрешение экрана")
        val сенсорныйЭкран = marketElementsFactory.filter("Сенсорный экран")
        val линейкаПроцессора = marketElementsFactory.filter("Линейка процессора")
        val количествоЯдерПроцессора = marketElementsFactory.filter("Количество ядер процессора")
        val оперативнаяПамять = marketElementsFactory.filter("Оперативная память")
        val типВидеокарты = marketElementsFactory.filter("Тип видеокарты")
        val видеокарта = marketElementsFactory.filter("Видеокарта")
        val объемВидеопамяти = marketElementsFactory.filter("Объем видеопамяти")
        val конфигурацияНакопителей = marketElementsFactory.filter("Конфигурация накопителей")
        val общийОбъемНакопителей = marketElementsFactory.filter("Общий объем всех накопителей")
        //...и т.д.
    }

    inner class Sorts {
        val поПопулярности = marketElementsFactory.sort("популярность", "dpop")
        val поЦене = marketElementsFactory.sort("цена", "dprice")
        val поРейтингу = marketElementsFactory.sort("рейтинг", "quality")
        val поОтзывам = marketElementsFactory.sort("отзывы", "opinions")
        val поРазмеруСкидки = marketElementsFactory.sort("скидка", "discount_p")
        val поНовизне = marketElementsFactory.sort("новизна", "ddate")

    }


}