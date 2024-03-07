package com.example.kotlinbasics

// broken code
/*
fun main() {
    val firstNumber = 10
    val secondNumber = 5

    println("$firstNumber + $secondNumber = $result")
}
 */

// fixed and better code
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val add1 = add(firstNumber, secondNumber)
    val add2 = add(firstNumber, thirdNumber)

    val subtract1 = subtract(firstNumber, secondNumber)
    val subtract2 = subtract(firstNumber, thirdNumber)

    println("Additions:")
    println("$firstNumber + $secondNumber = $add1")
    println("$firstNumber + $thirdNumber = $add2")

    println("Subtractions:")
    println("$firstNumber - $secondNumber = $subtract1")
    println("$firstNumber - $thirdNumber = $subtract2")
}

// Definition of add() function
fun add(numberOne: Int, numberTwo: Int): Int {
    return numberOne + numberTwo
}

// definition of subtract() function
fun subtract(numberOne: Int, numberTwo: Int): Int {
    return numberOne - numberTwo
}