package com.example.sirius

abstract class Shape(var x: Int, var y: Int) {
    val color: String = "azure"
}

class Circle(x: Int, y: Int, var radius: Double) : Shape(x, y) {


}