package com.stepdefinition;

import org.testng.annotations.Test;

import com.phpTravelsPagesdetails.HomeAndLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Test
public class LoginStepDefinition {

	@Given("Open Web URL")
	public void open_Web_URL() {

		HomeAndLoginPage.launchWebBrowser();

	}

	
	@When("Enter valid username {string} and password {string} and submit")
	public void enter_valid_username_and_password(String username, String password) throws InterruptedException {
		HomeAndLoginPage.myAccountLogin(username, password);
	}

	
	@Then("Verify Login page")
	public void login_successfully() throws InterruptedException {
		HomeAndLoginPage.validateLogin();
	}

	@Then("Close browser")
	public void close_browser() {
		HomeAndLoginPage.closeBrowser();
	}
}
