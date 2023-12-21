package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("User is on landing page");
	}

	@When("user gets the title of the login page")
	public void user_gets_the_title_of_the_login_page() {
	    System.out.println("User gets title of page");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	    System.out.println("Title of the page is "+string);
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	    System.out.println("user name entered by user is "+ username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	   System.out.println(" password entered by user is "+ password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	   System.out.println("User succesfully clicked on login button);
	}

	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
