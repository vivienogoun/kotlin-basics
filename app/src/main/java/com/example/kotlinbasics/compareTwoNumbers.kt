package com.example.kotlinbasics

fun main() {
    println(moreToday(300, 250))
    println(moreToday(300, 300))
    println(moreToday(200, 220))
}

fun moreToday(minToday: Int, minYesterday: Int): Boolean {
    return minToday > minYesterday
}