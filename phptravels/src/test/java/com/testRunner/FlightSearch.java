package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "./Features/FlightSearch.feature",glue= {"stepdefinition","FlightSearchStepDefinition.java"},plugin = { "pretty"})
public class FlightSearch {

}
