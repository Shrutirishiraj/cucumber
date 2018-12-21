package stepPack;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsClass {
@Given("^Open the application$")
public void m() {
	System.out.println("given meth");
}
@When("^Enter the Username and Password$")
public void n() {
	System.out.println("when meth");
}
@Then("^Reset the credential$")
public void b() {
	System.out.println("the meth");
}
}
