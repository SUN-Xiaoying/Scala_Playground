import scala.annotation.MainAnnotation
//@main
//def Main(args: String*): Unit =
//  runExample("Trait Params")(TraitParams.test())
//
//  runExample("Enum Types")(EnumTypes.test())
//
//  runExample("Context Functions")(ContextFunctions.test())
//
//  runExample("Given Instances")(GivenInstances.test())
//
//  runExample("Conversion")(Conversion.test())
//
//  runExample("Union Types")(UnionTypes.test())
//
//  runExample("Intersection Types")(IntersectionTypes.test())
//
//  runExample("Type Lambda")(TypeLambdas.test())
//
//  runExample("Multiversal Equality")(MultiversalEquality.test())
//
//  runExample("Parameter Untupling")(ParameterUntupling.test())
//
//  runExample("Structural Types")(StructuralTypes.test())
//
//  runExample("Pattern Matching")(PatternMatching.test())
//end Main
//
//private def runExample(name: String)(f: => Unit): Unit =
//  println(Console.MAGENTA + s"$name example:" + Console.RESET)
//  f
//  println()

abstract class A {
  val message: String
}

class B extends A {
  override val message: String = "I'm instance of B"
}

trait C extends A{
  def loudMessage = message.toUpperCase()
}

class D extends B with C

//@Runnable
//def Main(args: String*): Unit =
//  val d = new D
//  println(d.loudMessage)
//  println(d.message)