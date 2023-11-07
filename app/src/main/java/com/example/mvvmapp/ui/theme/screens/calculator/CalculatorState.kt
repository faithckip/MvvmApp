package com.example.mvvmapp.ui.theme.screens.calculator

data class CalculatorState(
    var number1: String="",
    val number2:String="",
    val operation: CalculatorOperation? = null
)
