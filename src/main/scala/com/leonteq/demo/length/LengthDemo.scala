package com.leonteq.demo.length

import com.leonteq.demo.length.LengthDemo.LengthSyntax.LengthDouble

object LengthDemo extends App {

  sealed trait LengthUnit
  case object Meter extends LengthUnit
  case object Yard  extends LengthUnit

  case class Length(value: Double, unit: LengthUnit)

  object LengthSyntax {
    implicit final class LengthDouble(val value: Double) extends AnyVal {
      def meters: Length = Length(value, Meter)
      def yards:  Length = Length(value, Yard)
    }
  }

  val m: Length = 3.14.meters
  val y: Length = 9.81.yards

  println(m)
  println(y)

}
