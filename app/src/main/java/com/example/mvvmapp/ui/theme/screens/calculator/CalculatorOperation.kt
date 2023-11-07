package com.example.mvvmapp.ui.theme.screens.calculator

import com.example.mvvmapp.ui.theme.screens.calculator.CalculatorOperation.Add.symbol

sealed class CalculatorOperation(val symbol: String){

    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("*")
    object Divide: CalculatorOperation("/")
}
