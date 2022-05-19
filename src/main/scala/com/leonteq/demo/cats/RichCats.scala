package com.leonteq.demo.cats

import com.leonteq.demo.CatOuterClass
import com.leonteq.demo.CatOuterClass.Cat
import com.leonteq.demo.cats.CatSyntax.RichCat

object RichCats extends App {

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
