package com.leonteq.demo.cats

import com.leonteq.demo.cat.Cat

object ScalaPbCats extends App {

  def print(cat: Cat): Unit = {
    println(
      cat
        .name
        .map(n => s"The cat's name is $n")
        .getOrElse("The cat has no name")
    )
    println(
      cat
        .mother
        .flatMap(_.name)
        .map(mn => s"The mother's name is $mn")
        .orElse(Some("The mother has no name"))
        .getOrElse("The cat has no mother")
    )
  }

  def demo(): Unit = {
    println("- Empty cat")
    print(Cat())

    println("- Felix without mother")
    print(Cat(name = Some("Felix")))

    println("- Felix with Mother")
    print(Cat(name = Some("Felix"), mother = Some(Cat())))

    println("- Felix with Mother Maria")
    print(Cat(name = Some("Felix"), mother = Some(Cat(name = Some("Maria")))))
  }

  demo()

}
