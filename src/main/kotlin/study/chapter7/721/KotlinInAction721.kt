package study.chapter7.`721`

import study.chapter7.Money


class Won(val value: Double) {

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Won) return false
        return other.value == this.value
    }

}

fun main() {

    // 동등성 두 객체의 값이 같은지
    // 동일성 두 객체가 같은지
    // 코틀린 === | 자바 ==
    // 코틀린 ==  | 자바  equals


    // data class의 경우 자동으로 equals를 생성해 준다
    println("money")
    println(Money(100.0) == Money(100.0)) //true
    println(Money(100.0).equals(Money(100.0))) // true
    println(Money(100.0) == Money(200.0)) // false
    println(Money(100.0).equals(Money(200.0))) // false


    // 식별자 비교 연산자 (identity)
    println(Money(100.0) === Money(100.0)) //false


    println("won")
    println(Won(100.0) == Won(100.0)) // true
    println(Won(100.0) === Won(100.0)) // false

}

