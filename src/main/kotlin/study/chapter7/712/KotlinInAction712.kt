package study.chapter7.`712`

fun main() {

    val list = arrayListOf(1, 2)
    println(list)
    list += 3
    println(list)

    val newList = list + listOf(4, 5)

    // list 연산에서의 + / - 는 항상 새로운 컬렉션을 반환
    // list 연산에서의 += / -= 는 뮤터블 컬렉션 원소 변환
    // 이뮤터블 list 연산에서의 += / -= 는 새로운 컬렉션 반환


    println(newList)

}
