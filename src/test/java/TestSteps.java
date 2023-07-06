import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;

public class TestSteps {
	String input;
	@Given("^User enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		input = arg1;
	}

	@Then("^Result should be (\\d+)$")
	public void result_should_be(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		RPNCalc obj = new RPNCalc();
		assertEquals(arg1, obj.Calculate(input));
	}

	@Given("^I have \"([^\"]*)\"$")
	public void i_have(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		input = arg1;
	}

	@Then("^I get  (\\d+)$")
	public void i_get(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		RPNCalc obj = new RPNCalc();
		assertEquals(arg1, obj.Calculate(input));
	}

}
