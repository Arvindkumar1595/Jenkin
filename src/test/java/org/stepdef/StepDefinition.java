package org.stepdef;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("user is on the facebook login page")
	public void user_is_on_the_facebook_login_page() {
		
		
		
		System.out.println("login page");
		
	}

	@When("user should enter the {string}and {string}")
	public void user_should_enter_the_and(String string, String string2) {
		
		
		System.out.println(string);
		System.out.println(string2);
		
	}

	@When("password and user should click the login button")
	public void password_and_user_should_click_the_login_button() {
		
		System.out.println("login button");
	}

	@Then("user should verify the success message")
	public void user_should_verify_the_success_message() {
		
		
		System.out.println("success");
		System.out.println("*********************************");
		
		
	}


}
