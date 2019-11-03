package study.chapter7.`752`

class Email {

}

private fun loadEmails(person: Person): List<Email> {
    return listOf(Email()) // todo
}

private fun loadEmails(person: Person2): List<Email> {
    return listOf(Email()) // todo
}

class Person(val name: String) {
    private var _emails: List<Email>? = null

    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }


}

class Person2(val name: String) {
    val emails by lazy {
        loadEmails(this)
    }
}

