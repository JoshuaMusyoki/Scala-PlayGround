package Basics

import scala.annotation.targetName

object ObjectOrientation extends App {
  class Animal{
//    defining fields
    val age: Int = 0
    def eat() = println("I am eating")
  }
  val animal = new Animal

//  inheritance
  class Dog(val name: String) extends Animal { //constructor definition
  val aDog = new Dog("Lassie")

//  constructor arguments are not fields; need to put a val keyword before name
    aDog.name

//    subtype polymorphism
  val aDeclaredAnimal: Animal = new Dog("Hachi")

//abstract class
  abstract class WalkingAnimal {
    val hasLegs = true
    def walk(): Unit
}

//interface
  trait Carnivore {
  def eat(animal: Animal): Unit
}
   trait Philosopher {
     @targetName(" ")
     def ?!(thought: String): Unit
   }

//mixing - single class inheritance and multi-traits
  class Crocodile extends Animal with Carnivore {
  override def eat(animal: Animal): Unit = println("Am eating you, animal!!")

  override def eat(): Unit = super.eat()
}
    val aCroc = new Crocodile
    aCroc.eat(aDog)
    aCroc eat aDog //infix notation - object method argument. only available to methods with one argument

}
  println("I am eating")
}
