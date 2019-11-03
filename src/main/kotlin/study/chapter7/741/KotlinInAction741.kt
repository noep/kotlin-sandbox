package study.chapter7.`741`

// 구조 분해 선언과 component 함수
// data class의 경우 componentN 함수 자동 생성
data class Point(val x: Int, val y: Int)

class Point2(val x: Int, val y: Int) {

    operator fun component1(): Int {
        return x
    }
}

operator fun Point2.component2(): Int = y

operator fun Point2.component3(): Int {
    return y
}

operator fun Point2.component9999(): Int {
    return y
}

// 구조 분해 선언 이용하기
data class NameComponents(val name: String, val extension: String)

fun splitFileName(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

fun splitFileName2(fullName: String): NameComponents {
    // 코틀린 표준 라이브러리에서는 맨 앞의 다섯 원소에 대한 componentN 함수를 제공한다.
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}


// 콜렉션에 대한 구조분해선언


fun main() {

    val p1 = Point(10, 20)
    val (x, y) = p1

    println(x)
    println(y)

    val p2 = Point2(10, 20)

    val (a1, b1, c1) = p2

    println(a1)
    println(b1)
    println(c1)

    val (name, ext) = splitFileName("example.kt")
    println("$name, $ext")


    // 컬렉션에 대해 구조분해선언 사용하기
    val x1 = listOf(1,2)
    // val (a2,b2,c2,d2,e2) = x1 // throws ArrayIndexOutOfBoundsException
    // val (a2,b2,c2,d2,e2,f2) = x1 // component6 함수를 찾을 수 없다고 나옴


    // 구조 분해 선언을 이용해 맵 반복시키기
    fun printEntries(map: Map<String, String>) {
        for (entry in map) {
            // entry in map : map에 대한 iterator를 반환
            // println ("${entry.key} -> ${entry.value}")
            println("${entry.component1()} -> ${entry.component2()}") // 동일한 결과가 출력
        }

        for ((key, value) in map) {
            println ("$key, -> $value")
        }
    }

    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)

}


