import org.junit.Assert.assertTrue

//import org.scalatest.funsuite.AnyFunSuite
class Iterator extends munit.FunSuite{

  val str = "Xiao"

  test("StringIterator hasNext") {
    val stringIterator = new StringIterator(str)

    assertTrue(stringIterator.hasNext)
    assertEquals(stringIterator.next(),'X')
  }
}
