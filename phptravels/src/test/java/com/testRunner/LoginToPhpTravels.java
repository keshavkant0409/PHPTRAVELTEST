package com.testRunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features= "./Features/Login.feature",glue= {"stepdefinition","com.LoginStepDefinition.java"},plugin = { "pretty"})


public class LoginToPhpTravels{
	
	
 
}
