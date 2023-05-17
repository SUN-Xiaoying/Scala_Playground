class HighOrder {

  // Named function: assign function to a value
  val add: (Int, Int) => Double = (a, b) => a + b
}

object Functions extends App {

  def sayHello():Unit = println("Hello")

  // High order functions
  def executeNTimes(f:()=> Unit, n:Int): Unit =
    for i <- 1 to n do f()

  executeNTimes(sayHello, 3)

  // Methods
  def add(a: Int, b: Int): Int = a + b
  println(add(1, 3))

  // Parameterization
  def pop[T](seq: Seq[T]): T = seq.head



}
