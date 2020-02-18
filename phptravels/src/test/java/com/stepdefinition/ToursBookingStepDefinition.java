package com.stepdefinition;

import org.testng.annotations.Test;

import com.phpTravelsPagesdetails.HomeAndLoginPage;
import com.phpTravelsPagesdetails.ToursBookingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@Test
public class ToursBookingStepDefinition {
	@Given("Open Web URL of Featured tour")
	public void open_Web_URL_of_Featured_tour() {
		ToursBookingPage.openTourPage();
	}

	@When("select tour")
	public void select_tour() {
		ToursBookingPage.selectTour();
	}

	@When("verify email share option")
	public void verify_email_share_option() {
		ToursBookingPage.verifyEmailShareOption();
	}

	@When("Enter Booking options details")
	public void enter_Booking_options_details() {
		ToursBookingPage.bookingOptions();
	}

	@When("click Check Availability")
	public void click_Check_Availability() {
		ToursBookingPage.checkAvaibility();
	}

	@Then("Personal Details page will open. Enter personal details")
	public void personal_Details_page_will_open_Enter_personal_details() {
		ToursBookingPage.personalDetails();
	}

	@Then("click Check Availability for booking")
	public void click_Check_Availability_for_booking() {
		ToursBookingPage.completeBooking();
	}

	@Then("Close tour browser page")
	public void close_tour_browser_page() {
		ToursBookingPage.closeBrowser();
	}
	
}
