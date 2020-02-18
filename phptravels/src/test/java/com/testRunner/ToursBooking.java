package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "./Features/ToursBooking.feature",glue= {"com.stepdefinition","ToursBookingStepDefinition.java"},plugin = { "pretty"})
public class ToursBooking {

}
