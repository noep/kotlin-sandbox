package study.chapter7.`713`

import study.chapter7.Money

operator fun Money.unaryMinus(): Money {
    return Money(-value)
}

operator fun Money.unaryPlus(): Money {
    return Money(+value)
}

// 이거 말고도 not, inc, dec 제공
// not  !a
// inc ++a, a++
// dec --a, a--
