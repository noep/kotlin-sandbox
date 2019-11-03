package study.chapter7.`751`

import java.lang.reflect.Type

//class Foo() {
//    var p: Int by Delegate(p)
//}

//class Foo {
//    private val delegatee = Delegate()
//
//    var p: Type
//    set(value: Type) = delegatee.setValue(value)
//    get() :Int = delegatee.getValue()
//}

class Delegate(private var p: Int) {
     fun getValue(): Int {
        return 1
    }

     fun setValue(value: Int) {
        this.p = value
    }
}
