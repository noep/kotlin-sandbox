package study.chapter7.`722`

// compareTo
// Comparable 인터페이스 구현 (자바에서는)
// 비교 연산자 > >= < <= 호출은 compareTo 의 호출로 컴파일된다
// compareTo의 반환값은 Int 임
//

class Person(val firstName: String, val lastName: String) : Comparable<Person> {

    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }

}

fun main() {
    val p1 = Person("b", "a")
    val p2 = Person("d", "c")

    println(p1 < p2)
}
