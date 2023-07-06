import static org.junit.Assert.assertEquals;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestStpes {
	String input;
	@Given("^user enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		input = arg1;
		
	}
	@Given("^user decide to do something$")
	public void user_decide_to_do_something() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	@Then("^user should get (\\d+)$")
	public void user_should_get(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		assertEquals(input,"2,3,1,+,+");
	}

}
