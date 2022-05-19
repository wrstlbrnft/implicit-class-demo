ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

Compile / PB.targets := Seq(
  scalapb.gen() -> (Compile / sourceManaged).value / "scalapb",
  PB.gens.java -> (Compile / sourceManaged).value
)

lazy val root = (project in file("."))
  .settings(
    name := "implicit-class-demo"
  )
