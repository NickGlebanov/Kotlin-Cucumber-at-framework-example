package com.nglebanov.selatstar.market.steps

import com.codeborne.selenide.Selenide
import com.nglebanov.selatstar.core.ashot.AshotService
import com.nglebanov.selatstar.core.base.BaseSteps
import com.nglebanov.selatstar.core.context.ThreadContext
import com.nglebanov.selatstar.market.elements.MarketElementsFactory
import com.nglebanov.selatstar.market.uipage.MarketNotebooksPage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MarketSteps : BaseSteps() {

    @Autowired
    lateinit var marketNotebooksPage: MarketNotebooksPage

    @Autowired
    lateinit var marketelms: MarketElementsFactory

    @Autowired
    private lateinit var context: ThreadContext

    @Autowired
    private lateinit var ashotService: AshotService

    init {

        And("^открываем страницу ноутбуков маркета$") {
            Selenide.open(marketNotebooksPage.url)
            ashotService.hideScrollbar()
            ashotService.takeEtalonScreenshotAndSave("notebooks")
        }

        And("^сортируем ноутбуки по (новизне|отзывам|популярности|размеру скидки|рейтингу|цене)$") { sortRule: String ->
            when (sortRule) {
                "новизне" -> marketNotebooksPage.Sorts().поНовизне.click()
                "отзывам" -> marketNotebooksPage.Sorts().поОтзывам.click()
                "популярности" -> marketNotebooksPage.Sorts().поПопулярности.click()
                "размеру скидки" -> marketNotebooksPage.Sorts().поРазмеруСкидки.click()
                "рейтингу" -> marketNotebooksPage.Sorts().поРейтингу.click()
                "цене" -> marketNotebooksPage.Sorts().поЦене.click()
            }
        }
    }
}