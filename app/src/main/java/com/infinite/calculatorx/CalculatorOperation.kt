package com.infinite.calculatorx

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("*")
    object Divide: CalculatorOperation("/")
    object Percent: CalculatorOperation("%")
//    object Percent: CalculatorOperation("%")
}
