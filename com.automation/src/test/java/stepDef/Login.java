package stepDef;

import java.util.Properties;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.DataProvider;
import driverInstance.SharedDriver;
import pageobjects.AccountPageObjects;
import utilities.Utility;

public class Login extends SharedDriver{
	
	DataProvider dataread;
	Properties properties;
	Utility util;

	AccountPageObjects obj = new AccountPageObjects(driver);
	
	@Given("^Test Amazon login with valid username and password$")
	public void test_Amazon_login_with_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Launch LinkedIn application");
		setUp();
		System.out.println("driver=" + driver);
		
	}

	@When("^I launch chrome browser$")
	public void i_launch_chrome_browser() throws Throwable {
	
		dataread = new DataProvider();
		driver.get(dataread.getApplicationUrl());
		Utility.takeScreenShot(driver, "homepage");
		//System.out.println("driver=" + driver);
		
	}
	
	@When("^I click amazon login homepage$")
	public void i_click_amazon_login_homepage() throws Throwable {
		System.out.println(" Click on Hello-Sign-in");	
		AccountPageObjects obj = new AccountPageObjects(driver);
		obj.join_now();
		
	}

	@When("^I enter \"([^\"]*)\" id$")
	public void i_enter_id(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" ****2");
		AccountPageObjects obj = new AccountPageObjects(driver);
		obj.enterFirstName("test");
		obj.enter_LasttName("testroom");
		obj.password("TEST12345");
		obj.email("test@ymail.com");
		
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AccountPageObjects obj = new AccountPageObjects(driver);
	    obj.submitbtn();
	}

	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	
}
