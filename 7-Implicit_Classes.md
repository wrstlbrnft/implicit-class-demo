## Implicit Classes
Implicit classes are available since Scala 2.10.
From [the doc](https://docs.scala-lang.org/overviews/core/implicit-classes.html):
> "An _implicit class_ is a class marked with the `implicit` keyword. This keyword makes the class’s primary constructor available for implicit conversions when the class is in scope."

- Cannot be top-level (must be inside `class`, `trait` or `object`)
- Can only take one explicit parameter (additional `implicit` parameters are fine)
- Extend `AnyVal` to avoid instantiation


## Applied to our Example
Implicit class extending the API of our `Cat` [CatSyntax.scala](src/main/scala/com/leonteq/demo/cats/CatSyntax.scala)

Using that new API in the code looks a lot more Scala-like [RichCats.scala](src/main/scala/com/leonteq/demo/cats/RichCats.scala)

#
#
[next](8-Second_Example.md)