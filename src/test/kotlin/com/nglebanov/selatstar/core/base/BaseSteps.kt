package com.nglebanov.selatstar.core.base

import io.cucumber.java8.En
import io.cucumber.java8.StepDefinitionBody
import io.qameta.allure.Allure

abstract class BaseSteps : En {
    override fun But(expression: String?, body: StepDefinitionBody.A0?) {
        Allure.step(expression)
        super.But(expression, body)
    }

    override fun <T1 : Any?> But(expression: String?, body: StepDefinitionBody.A1<T1>?) {
        Allure.step(expression)
        super.But(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?> But(expression: String?, body: StepDefinitionBody.A2<T1, T2>?) {
        Allure.step(expression)
        super.But(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?> But(expression: String?, body: StepDefinitionBody.A3<T1, T2, T3>?) {
        Allure.step(expression)
        super.But(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?> But(expression: String?, body: StepDefinitionBody.A4<T1, T2, T3, T4>?) {
        Allure.step(expression)
        super.But(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?> But(expression: String?, body: StepDefinitionBody.A5<T1, T2, T3, T4, T5>?) {
        Allure.step(expression)
        super.But(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?> But(expression: String?, body: StepDefinitionBody.A6<T1, T2, T3, T4, T5, T6>?) {
        Allure.step(expression)
        super.But(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?> But(expression: String?, body: StepDefinitionBody.A7<T1, T2, T3, T4, T5, T6, T7>?) {
        Allure.step(expression)
        super.But(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?, T8 : Any?> But(expression: String?, body: StepDefinitionBody.A8<T1, T2, T3, T4, T5, T6, T7, T8>?) {
        Allure.step(expression)
        super.But(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?, T8 : Any?, T9 : Any?> But(expression: String?, body: StepDefinitionBody.A9<T1, T2, T3, T4, T5, T6, T7, T8, T9>?) {
        Allure.step(expression)
        super.But(expression, body)
    }

    override fun Given(expression: String?, body: StepDefinitionBody.A0?) {
        Allure.step(expression)
        super.Given(expression, body)
    }

    override fun <T1 : Any?> Given(expression: String?, body: StepDefinitionBody.A1<T1>?) {
        Allure.step(expression)
        super.Given(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?> Given(expression: String?, body: StepDefinitionBody.A2<T1, T2>?) {
        Allure.step(expression)
        super.Given(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?> Given(expression: String?, body: StepDefinitionBody.A3<T1, T2, T3>?) {
        Allure.step(expression)
        super.Given(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?> Given(expression: String?, body: StepDefinitionBody.A4<T1, T2, T3, T4>?) {
        Allure.step(expression)
        super.Given(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?> Given(expression: String?, body: StepDefinitionBody.A5<T1, T2, T3, T4, T5>?) {
        Allure.step(expression)
        super.Given(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?> Given(expression: String?, body: StepDefinitionBody.A6<T1, T2, T3, T4, T5, T6>?) {
        Allure.step(expression)
        super.Given(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?> Given(expression: String?, body: StepDefinitionBody.A7<T1, T2, T3, T4, T5, T6, T7>?) {
        Allure.step(expression)
        super.Given(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?, T8 : Any?> Given(expression: String?, body: StepDefinitionBody.A8<T1, T2, T3, T4, T5, T6, T7, T8>?) {
        Allure.step(expression)
        super.Given(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?, T8 : Any?, T9 : Any?> Given(expression: String?, body: StepDefinitionBody.A9<T1, T2, T3, T4, T5, T6, T7, T8, T9>?) {
        Allure.step(expression)
        super.Given(expression, body)
    }

    override fun Then(expression: String?, body: StepDefinitionBody.A0?) {
        Allure.step(expression)
        super.Then(expression, body)
    }

    override fun <T1 : Any?> Then(expression: String?, body: StepDefinitionBody.A1<T1>?) {
        Allure.step(expression)
        super.Then(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?> Then(expression: String?, body: StepDefinitionBody.A2<T1, T2>?) {
        Allure.step(expression)
        super.Then(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?> Then(expression: String?, body: StepDefinitionBody.A3<T1, T2, T3>?) {
        Allure.step(expression)
        super.Then(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?> Then(expression: String?, body: StepDefinitionBody.A4<T1, T2, T3, T4>?) {
        Allure.step(expression)
        super.Then(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?> Then(expression: String?, body: StepDefinitionBody.A5<T1, T2, T3, T4, T5>?) {
        Allure.step(expression)
        super.Then(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?> Then(expression: String?, body: StepDefinitionBody.A6<T1, T2, T3, T4, T5, T6>?) {
        Allure.step(expression)
        super.Then(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?> Then(expression: String?, body: StepDefinitionBody.A7<T1, T2, T3, T4, T5, T6, T7>?) {
        Allure.step(expression)
        super.Then(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?, T8 : Any?> Then(expression: String?, body: StepDefinitionBody.A8<T1, T2, T3, T4, T5, T6, T7, T8>?) {
        Allure.step(expression)
        super.Then(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?, T8 : Any?, T9 : Any?> Then(expression: String?, body: StepDefinitionBody.A9<T1, T2, T3, T4, T5, T6, T7, T8, T9>?) {
        Allure.step(expression)
        super.Then(expression, body)
    }

    override fun And(expression: String?, body: StepDefinitionBody.A0?) {
        Allure.step(expression)
        super.And(expression, body)
    }

    override fun <T1 : Any?> And(expression: String?, body: StepDefinitionBody.A1<T1>?) {
        Allure.step(expression)
        super.And(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?> And(expression: String?, body: StepDefinitionBody.A2<T1, T2>?) {
        Allure.step(expression)
        super.And(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?> And(expression: String?, body: StepDefinitionBody.A3<T1, T2, T3>?) {
        Allure.step(expression)
        super.And(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?> And(expression: String?, body: StepDefinitionBody.A4<T1, T2, T3, T4>?) {
        Allure.step(expression)
        super.And(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?> And(expression: String?, body: StepDefinitionBody.A5<T1, T2, T3, T4, T5>?) {
        Allure.step(expression)
        super.And(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?> And(expression: String?, body: StepDefinitionBody.A6<T1, T2, T3, T4, T5, T6>?) {
        Allure.step(expression)
        super.And(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?> And(expression: String?, body: StepDefinitionBody.A7<T1, T2, T3, T4, T5, T6, T7>?) {
        Allure.step(expression)
        super.And(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?, T8 : Any?> And(expression: String?, body: StepDefinitionBody.A8<T1, T2, T3, T4, T5, T6, T7, T8>?) {
        Allure.step(expression)
        super.And(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?, T8 : Any?, T9 : Any?> And(expression: String?, body: StepDefinitionBody.A9<T1, T2, T3, T4, T5, T6, T7, T8, T9>?) {
        Allure.step(expression)
        super.And(expression, body)
    }

    override fun When(expression: String?, body: StepDefinitionBody.A0?) {
        Allure.step(expression)
        super.When(expression, body)
    }

    override fun <T1 : Any?> When(expression: String?, body: StepDefinitionBody.A1<T1>?) {
        Allure.step(expression)
        super.When(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?> When(expression: String?, body: StepDefinitionBody.A2<T1, T2>?) {
        Allure.step(expression)
        super.When(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?> When(expression: String?, body: StepDefinitionBody.A3<T1, T2, T3>?) {
        Allure.step(expression)
        super.When(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?> When(expression: String?, body: StepDefinitionBody.A4<T1, T2, T3, T4>?) {
        Allure.step(expression)
        super.When(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?> When(expression: String?, body: StepDefinitionBody.A5<T1, T2, T3, T4, T5>?) {
        Allure.step(expression)
        super.When(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?> When(expression: String?, body: StepDefinitionBody.A6<T1, T2, T3, T4, T5, T6>?) {
        Allure.step(expression)
        super.When(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?> When(expression: String?, body: StepDefinitionBody.A7<T1, T2, T3, T4, T5, T6, T7>?) {
        Allure.step(expression)
        super.When(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?, T8 : Any?> When(expression: String?, body: StepDefinitionBody.A8<T1, T2, T3, T4, T5, T6, T7, T8>?) {
        Allure.step(expression)
        super.When(expression, body)
    }

    override fun <T1 : Any?, T2 : Any?, T3 : Any?, T4 : Any?, T5 : Any?, T6 : Any?, T7 : Any?, T8 : Any?, T9 : Any?> When(expression: String?, body: StepDefinitionBody.A9<T1, T2, T3, T4, T5, T6, T7, T8, T9>?) {
        Allure.step(expression)
        super.When(expression, body)
    }

}