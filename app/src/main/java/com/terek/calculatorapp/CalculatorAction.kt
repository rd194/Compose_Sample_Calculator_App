package com.terek.calculatorapp

sealed class CalculatorAction {
    data class Number(val number:Int):CalculatorAction()
    data object Clear:CalculatorAction()
    object Calculate:CalculatorAction()
    object Decimal:CalculatorAction()
    object Delete:CalculatorAction()
    data class operation(val operation: CalculatorOperation):CalculatorAction()
}