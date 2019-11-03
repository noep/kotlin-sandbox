package study.chapter7.`711`

import study.chapter7.Money

operator fun Money.plus(other: Money): Money {
    return Money(value + other.value)
}

operator fun Money.minus(other: Money): Money {
    return Money(value - other.value)
}

operator fun Money.times(other: Money): Money {
    return Money(value * other.value)
}

operator fun Money.div(other: Money): Money {
    return Money(value / other.value)
}

// 두 피연산자의 타입이 다른 연산자 정의하기
// 연산자 오버로딩의 오버라이딩 1
operator fun Money.div(other: Double): Money {
    return Money(value / other)
}

operator fun Money.rem(other: Money): Money {
    return Money(value % other.value)
}

// 교환 법칙을 만족하지 않으므로, 확장 함수를 이용해 별도의 연산자를 정의한다.
operator fun Double.plus(other: Money): Money {
    return Money(this + other.value)
}


fun main(args: Array<String>) {

    println("Hello, World")
    val a = Money(100.0)
    val b = Money(200.0)
    // 7.1.1이항 산술 연산자 오버로딩
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a / 200.0)
    println(a % b)

    println(100.0 + Money(100.0))

}
