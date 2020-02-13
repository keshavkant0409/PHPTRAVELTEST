package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.phpTravelsPagesdetails.HomeAndLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@Test
public class EnableNewsletterStepDefinition {

	

	@Given("Open Web browser and URL")
	public void open_Web_URL() {
	    HomeAndLoginPage.launchWebBrowser();
	}

	@When("Scroll to bottom and click on subscribe after entering valid email {string}")
	public void scroll_to_bottom_and_click_on_subscribe_after_entering_valid_email(String email) throws InterruptedException {
		HomeAndLoginPage.subscribeNewsletter(email);
	}

	@Then("Newsletter subscription Response")
	public void newsletter_subscription_Response() throws InterruptedException {
		HomeAndLoginPage.validateNewsletterSubscription();
	}

	@Then("Close window")
	public void close_window() {
		HomeAndLoginPage.closeBrowser();
	}
}
