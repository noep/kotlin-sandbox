package study.chapter7.`732`


// in관례
// 객체가 컬렉션에 들어있는지 검사, contains

data class Point(val x: Int, val y: Int)

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y

}

fun main() {

    val x = 10
    val y = 20
    println(x until y) // IntRange를 리턴하는 Int의 확장함수 until을 infix 형태로 사용한다

    val rect = Rectangle(Point(10,20), Point(50,50))
    println (Point(20,30) in rect) // true
    println (Point(5,5) in rect) // false


    val list = listOf(1,2,3,4,5)

    println(list)
    println(3 in list)

    println(5 in 1..10) // true
    println(11 in 1..10) // false
    println(5 in (1..10).toList()) // true
}
