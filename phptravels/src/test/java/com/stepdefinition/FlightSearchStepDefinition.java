package com.stepdefinition;



import org.testng.annotations.Test;

import com.phpTravelsPagesdetails.FlightReservationPage;
import com.phpTravelsPagesdetails.HomeAndLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Test
public class FlightSearchStepDefinition {
	
	@Given("Open Web browser and URL for flight search")
	public void open_Web_browser_and_URL_for_flight_search() {
		HomeAndLoginPage.launchWebBrowser();
	}
	
	@When("Select Flight at home and enter departure, destination and date")
	public void select_Flight_at_home_and_enter_departure_destination_and_date() {
	
    
    	FlightReservationPage.selectFlightAtHomeAndEnterDetails();
		}
	
	@When("Click on Search")
	public void click_on_Search() throws InterruptedException {
		FlightReservationPage.performFlightSearchAction();
		
	}
	
	@Then("Select Route Stop and Airline")
	public void select_Route_Stop_and_Airline() throws InterruptedException {
		FlightReservationPage.selectRouteStopAndAirline();
		
	}
	
	@Then("Close window after flight search")
	public void close_browser() {
		HomeAndLoginPage.closeBrowser();
	}
}
