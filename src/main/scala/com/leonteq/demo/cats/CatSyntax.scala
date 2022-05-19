package com.leonteq.demo.cats

import com.leonteq.demo.CatOuterClass.Cat

object CatSyntax {

  implicit final class RichCat(val cat: Cat) extends AnyVal {
    def name:   Option[String] = if (cat.hasName)   Some(cat.getName)   else None
    def mother: Option[Cat]    = if (cat.hasMother) Some(cat.getMother) else None
  }

}
