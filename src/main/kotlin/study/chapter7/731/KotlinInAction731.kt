package study.chapter7.`731`

import kotlin.IndexOutOfBoundsException

// 인덱스 연산('[]') 을 사용할 operator의 재정의
data class Point(val x: Double, val y: Double)


operator fun Point.get(index: Int): Double {
    return when (index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

operator fun Point.get(axis: String): Double {
    return when (axis) {
        "x" -> x
        "y" -> y
        else -> throw IndexOutOfBoundsException("Invalid axis $axis")
    }
}

// 이 경우 복수개의 인자를 받을 수도 있음
data class ThreeDimensionPoint(val x: Double, val y: Double, val z: Double)

operator fun ThreeDimensionPoint.get(x: Double, y: Double): Double {
    if (this.x == x && this.y == y) {
        return z;
    } else {
        throw IllegalArgumentException("Invalid value $x, $y")
    }
}

// set의 구현
data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

// 인덱스 연산 관례
fun main() {

    val map = mapOf("hello" to "world", "hi" to "kotlin")
    println(map["hello"])  // "world"

    val point = Point(10.0, 20.0)

    println(point[0])

    println(point["x"])
    println(point["y"])
    // println(point["z"]) // throw IndexOutOfBoundsException

    val point3d = ThreeDimensionPoint(1.0, 2.0, 3.0)
    println(point3d[1.0, 2.0])
    // println(point3d[1.0, 3.0]) // throw IllegalArgumentException

    // setter의 구현
    val mutablePoint = MutablePoint(10,20)
    println(mutablePoint.x)
    mutablePoint[0] = 42
    println("mutablePoint x = ${mutablePoint.x}")
    mutablePoint.y = 42
    println(mutablePoint)
}

