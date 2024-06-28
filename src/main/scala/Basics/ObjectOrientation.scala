package Basics

object ObjectOrientation extends App {
  class Animal{
    val age: Int = 0
    def eat() = println("I am eating")
  }
  val animal = new Animal

//  inheritance
  class Dog extends Animal {

}
  println("I am eating")
}
