package com.ds.kotlin

class ScopeFunction {

    fun letEx(){
        var a = 10;

      a =  a.let {
            var a = 20
          a
            //println(a)
        }

        println(a)
    }

    fun runEx()
    {
        var a = 40;

      a =  a.run {
            var a = 90
            a
        }

        println(a)
    }
}

fun main() {
    ScopeFunction().letEx()
    ScopeFunction().runEx()
}