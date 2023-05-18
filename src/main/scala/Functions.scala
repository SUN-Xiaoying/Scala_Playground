class HighOrder {

  // Named function: assign function to a value
  val add: (Int, Int) => Double = (a, b) => a + b

  // Methods
  def sum(a: Int, b: Int): Int = a + b

  // Parameterization
  def pop[T](seq: Seq[T]): T = seq.head

  // High order functions
  def executeNTimes(f: () => Unit, n: Int): Unit =
    for i <- 1 to n do f()


}

object Functions extends App {

  val highOrder = new HighOrder();
  def sayHello():Unit = println("Hello")

  highOrder.executeNTimes(sayHello, 3)

  val nums = 1 to 3




}
