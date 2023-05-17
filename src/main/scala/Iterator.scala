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

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next(): T
}

// 因为RichIterator是个trait，可以不必实现AbsIterator中的抽象成员。
trait RichIterator() extends AbsIterator {
  def forEach(f: T => Unit): Unit = while (hasNext) f(next())
}

class StringIterator(s: String) extends AbsIterator with RichIterator {
  type T = Char
  private var i = 0
  def hasNext = i<s.length
  def next(): Char = {
    val ch = s charAt i
    i += 1
    ch
  }
}

object StringIteratorTest extends App {

  /*
  * class:        RickStringIter
  * Parent class: StringIterator
  * Mixin:        RichIterator
  * */
  class RichStringIter extends StringIterator("Scala") with RichIterator

  // Class object
  val richIter = new RichStringIter

  /* println(richIter)
  // StringIteratorTest $RichStringIter  @75bd9247
  */
  richIter forEach println
}

// `${i+1}`, expression
