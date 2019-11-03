package study.chapter7.`755`

class Person {
    // 추가 정보
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    // 필수 정보
    val name: String
        get() = _attributes["name"]!!
}

class Person2 {
    // 추가 정보
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    // 필수 정보
    val name: String by _attributes
}

fun main() {
    val p = Person()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")

    for ((attrName, value) in data) {
        p.setAttribute(attrName, value)
    }

    println(p.name)

    val p2 = Person2()
    val data2 = mapOf("name" to "Dmitry", "company" to "JetBrains")

    for ((attrName, value) in data2) {
        p2.setAttribute(attrName, value)
    }

    print(p2.name) // _attributes.getValue(p, prop) -> attributes[prop.name]

}
