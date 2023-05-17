class Functions extends munit.FunSuite{

  test("test add named funtcion") {
    val highOrder = new HighOrder()
    assertEquals(highOrder.add(1, 3), 4.0)
  }

}
