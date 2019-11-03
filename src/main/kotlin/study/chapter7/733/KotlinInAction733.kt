package study.chapter7.`733`

import java.time.LocalDate
import java.time.LocalDateTime


// rangeTo 관례 ..

// 1..10 1부터 10까지 모든 수가 들어있는 범위
// start .. end == start.rangeTo(end
fun main() {
    1..10 // IntRange를 리턴하는 연산자 `..`

    println(1..10)
    println((1..10).toList())

    // public operator fun <T : Comparable<T>> T.rangeTo(that: T): ClosedRange<T> = ComparableRange(this, that)
    val now = LocalDateTime.now()
    val vacation = now..now.plusDays(10)
    val vacation2 = now.rangeTo(now.plusDays(10))

    println(vacation)


    val n = 9
    println(1..n + 1) // 1..10
    // 0..n.forEach {print(it)} // compile error
    (0..n).forEach { println(it) }


    // for loop 를 위한 iterator 관례
    // public operator fun CharSequence.iterator(): CharIterator = object : CharIterator() {
    for (char in "abc") {
        println(char)
    }


    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) {
        println(dayOff)
    }


}


//operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> {
//    return object : Iterator<LocalDate> {
//        var current = start
//
//        override fun hasNext() =
//            current <= endInclusive
//
//        override fun next() = current.apply {
//            current = plusDays(1)
//        }
//    }
//}


operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start

        override fun hasNext() =
            current <= endInclusive

        override fun next() = current.apply {
            current = plusDays(1)
        }
    }
