package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.DataProvider;
import driverInstance.SharedDriver;
import utilities.Utility;

public class Login extends SharedDriver{
	
	DataProvider dataread;
	Utility util;
	
	@Given("^Test Amazon login with valid username and password$")
	public void test_Amazon_login_with_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" -- This is test 1");
		setUp();
		dataread = new DataProvider();
		driver.get(dataread.getApplicationUrl());
		util.takeScreenShot(driver, "homepage");
		
	}

	@When("^I launch chrome browser$")
	public void i_launch_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" -- This is test 2");
	}
	@When("^I enter username$")
	public void i_enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" -- This is test 3");
	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" -- This is test 4");
	}

	@Then("^I click on login button$")
	public void iclickon_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" -- This is test 5");
	}
	@When("^I enter amazon login homepage$")
	public void i_enter_amazon_login_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" -- This is test 6");
	}
}
