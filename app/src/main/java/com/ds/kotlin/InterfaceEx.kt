package com.ds.kotlin

fun main() {

    CheckInterface().display()
    CheckInterface().name()
    println(CheckInterface().age())
}


class CheckInterface : InterfaceEx{
    override fun display() {
        println("Display")
    }

}
interface InterfaceEx {
    fun display()
    fun name() {
       println("Name")
    }
    fun age() = 12
}