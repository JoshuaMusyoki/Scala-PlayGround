package Basics

object Basics extends App {

//  defining a value
private val meaningOfLife: Int = -42

//type mentioning in scala is optional
val aBoolean = false

//  String operations
//defining a string
val aString = "I Love nerds"
val aComposedString = "I"+" "+"Love"+"Scala"
//string concatenation
 private val interpolatedString = s"The meaning of life is $meaningOfLife"

//expressions - structures that can be reduced to a value
private val expressions = 2+3

//if expression
private val ifExpression = if (meaningOfLife>43) 56 else 9999
private val chainedExpression =
 if (meaningOfLife>43) 56
 else if (meaningOfLife<0) -2
 else if (meaningOfLife>999) 78
 else 0

// Codeblocks
private val aCodeblock = {
  // definitions
  val aLocalValue = 67

  // the value of the block is the last value of the parameter
  aLocalValue + 3

  // defining functions
  def myFunction(x: Int, y: String): String = {
    y + " " + x
  }

  println(s"The Local value is: $aLocalValue")
  println(myFunction(2, "Hello"))
}
//unit types
println("I Love Nerds...")

println(s"The meaning of life is: $chainedExpression")
println(s"The meaning of life is: $ifExpression")

}
//in scala we don't use loops and iterations, we use Recursions and functions
//Recursive functions
def factorial(n: Int): Int = {
  if(n<=1) 1
  else{
    val result = n * factorial(n - 1)
    result
  }
}

// the unit type
def unitTypeReturningFunction(): Unit ={
  println("I don't love returning units...")
}

