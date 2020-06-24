package com.nglebanov.selatstar.market.aspects

import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class ExampleAspect {

    //@Pointcut("execution(* com.nglebanov.selatstar.market.elements.MarketElements.*(..))")
    //fun callAtMyServicePublic() = run { }
//
    //@Before("callAtMyServicePublic()")
    //fun beforeCallAtMethod1(jp: JoinPoint?) {
    //    println("Before aop example")
    //}
//
    //@After("callAtMyServicePublic()")
    //fun afterCallAt(jp: JoinPoint?) {
    //    println("After aop example")
    //}
}