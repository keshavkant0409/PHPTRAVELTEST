package com.phpTravelsPagesdetails;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FlightReservationPage {

	static WebDriver driver = HomeAndLoginPage.driver;
	static JavascriptExecutor js = (JavascriptExecutor) driver;

	public static void selectFlightAtHomeAndEnterDetails() {

		js.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.xpath("//a[contains(@class,'flights')]")).click();
		driver.findElement(By.xpath("(//a[@class='select2-choice'])[2]")).click();

		driver.findElement(By.cssSelector("#select2-drop > div > input")).sendKeys("kolkata");

		driver.findElement(By.cssSelector("#select2-drop > ul > li > div")).click();
		driver.findElement(By.xpath("(//a[@class='select2-choice' ])[3]")).click();
		driver.findElement(By.cssSelector("#select2-drop > div > input")).sendKeys("bangalore");
		driver.findElement(By.cssSelector("#select2-drop > ul > li > div")).click();

		js.executeScript("document.getElementById('FlightsDateStart').value='2020-03-14'");
	}

	public static void performFlightSearchAction() throws InterruptedException {
		driver.findElement(By.xpath("(//button[contains(text(),'Search')])[2]")).click();
		Thread.sleep(3000);
	}

	public static void selectRouteStopAndAirline() throws InterruptedException {
		WebElement RouteStops = driver.findElement(By.xpath("//input[@type='radio' and @id='0']"));
		System.out.println("Check Route Stop radiobutton Enablity: " + RouteStops.isEnabled());
		driver.findElement(By.xpath("//label[@for='0']")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1500)");
		WebElement selectFliight = driver.findElement(By.xpath("//input[@type='checkbox' and @id='check_1']"));
		System.out.println("Check Airlines Checkbox Enablity: " + selectFliight.isEnabled());
		WebElement checkbox = driver.findElement(By.cssSelector("#myBtn > label[for='check_1'] > img"));
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(3000);

	}
}
