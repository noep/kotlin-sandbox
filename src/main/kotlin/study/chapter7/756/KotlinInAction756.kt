package study.chapter7.`756`


/*
// 위임 프로퍼티를 사용해 데이터베이스 칼럼 접근하기
// exposed 가 잘 쓰고 있음
object Users : IdTable() {
    val name = varchar("name" length =50).index()
    val age = integer("age")
}

class User(id: EntityId) : Entity(id) {
    var name: String by Users.name
    var age: Int by Users.age
}

 */
