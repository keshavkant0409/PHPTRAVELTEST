package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "./Features/EnableNewsletter.feature",glue= {"stepdefinition","EnableNewsletterStepDefinition.java"})

public class EnableNewsletter {

}
