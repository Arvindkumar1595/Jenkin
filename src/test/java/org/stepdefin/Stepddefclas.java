package org.stepdefin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepddefclas {
	
	@Given("user is on the facebook login page one")
	public void user_is_on_the_facebook_login_page_one() {
		System.out.println("login1");
		
	}

	@When("user should enter the username and password")
	public void user_should_enter_the_username_and_password() {
		System.out.println("User1");
	}

	@When("password and user should click the login button")
	public void password_and_user_should_click_the_login_button() {
		System.out.println("login click1");
	}

	@Then("user should verify the success message")
	public void user_should_verify_the_success_message() {
		System.out.println("succes1");
	}

	@Given("user is on the facebook login page two")
	public void user_is_on_the_facebook_login_page_two() {
		System.out.println("login2");
	}

	@Given("user is on the facebook login page three")
	public void user_is_on_the_facebook_login_page_three() {
		System.out.println("login3");
	}

}
