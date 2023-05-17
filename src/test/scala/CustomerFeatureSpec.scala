import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers


class CustomerFeatureSpec extends AnyFeatureSpec with GivenWhenThen with Matchers {
  info("As a Customer")
  info("I should have my Full Name composed from first and last names")

  feature("Customer Full Name") {
    scenario("Customer has correct Full Name representation") {
      Given("A Customer with first and last name")
      val customer = Customer("John", "Smith")
      When("full name is queried")
      val fullName = customer.fullName
      Then("first and last names should be returned")
      fullName should be ("John Smith")
    }
  }
}
