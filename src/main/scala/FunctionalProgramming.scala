case class FunctionalProgramming() {

  val a = List("jane", "jon", "mary", "joe")

  val b = a.filter(_.startsWith("j"))
    .map(_.capitalize)


  def makeInt(s: String): Option[Int] =
    try
      Some(Integer.parseInt(s.trim))
    catch
      case e: Exception => None

  def justInt(s: String): Unit =
    makeInt(s.trim) match
      case Some(i) => println(i)
      case None => println("No integer")
}

object FunctionalProgramming extends App {

  val fp = new FunctionalProgramming()

  fp.justInt("one")
  fp.justInt("1")
  fp.justInt("two2")

}