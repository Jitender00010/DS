package com.ds.kotlin

import java.lang.Exception

fun main() {

    val repeatFun: String.(Int) -> String = {times ->
        var dd : String = ""
        for (i in 1..times){
            dd += this
        }
        dd
       // this.repeat(times)


        // " test "
    }
    val twoParameters: (String, Int) -> String = {l : String ,i:Int->

          "dd"
    }// OK

    fun runTransformation(f: (String, Int) -> String): String {
        return f("hello ",6)
    }
    val result = runTransformation(repeatFun)

//   println("Result- $result")

    second()

    addtionFun()

}

fun addtionFun() {
    var add : Int.(Int) -> String = {b ->
       var c = this+b
        c.toString()
    }

    var res = add(4,5)
    println(res)
}


fun second(){
    val stringPlus: (String, String) -> String = {it,a->
        it.plus(a)
       // String::plus
    }
    val intPlus: Int.(Int) -> Int = {a ->
        var kk = this
        kk.plus(a)
    }

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3))
}