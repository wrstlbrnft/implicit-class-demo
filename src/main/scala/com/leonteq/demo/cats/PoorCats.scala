package com.leonteq.demo.cats

import com.leonteq.demo.CatOuterClass
import com.leonteq.demo.CatOuterClass.Cat

object PoorCats extends App {

  def print(cat: Cat): Unit = {
    if (cat.hasName) println(s"The cat's name is ${cat.getName}")
    else println("The cat has no name")
    if (cat.hasMother && cat.getMother.hasName) println(s"The mother's name is ${cat.getMother.getName}")
    else if (cat.hasMother) println("The mother has no name")
    else println("The cat has no mother")
  }

  def demo(): Unit = {
    println("- Empty cat")
    print(CatOuterClass.Cat.newBuilder().build())

    println("- Felix without mother")
    print(CatOuterClass.Cat.newBuilder().setName("Felix").build())

    println("- Felix with Mother")
    print(CatOuterClass.Cat.newBuilder().setName("Felix").setMother(CatOuterClass.Cat.newBuilder()).build())

    println("- Felix with Mother Maria")
    print(CatOuterClass.Cat.newBuilder().setName("Felix").setMother(CatOuterClass.Cat.newBuilder().setName("Maria")).build())
  }

  demo()


}
