package com.phpTravelsPagesdetails;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToursBookingPage {
	static WebDriver driver;
	//static JavascriptExecutor js=(JavascriptExecutor) driver;
	
	
	
	
	public static void openTourPage() {
	System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.phptravels.net/packages/search/egypt/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void selectTour() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)");
	driver.findElement(By.xpath("(//button[text()='Search'])[1]")).click();
	}
	//JavascriptExecutor js=(JavascriptExecutor) driver;
	public static void verifyEmailShareOption() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement emailbox=driver.findElement(By.xpath("//*[@id=\"st-1\"]/div[4]"));
	//js.executeScript("arguments[0].scrollIntoView();",emailbox);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,450)");
	System.out.println("check email share option is displayed:"+emailbox.isDisplayed());
	System.out.println("check email share option is enabled:"+emailbox.isEnabled());
	System.out.println("check email share option is selected:"+emailbox.isSelected());
	}
	public static void bookingOptions() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement title=driver.findElement(By.xpath("//*[@class='heading clearfix']"));
	String BookingTitle=title.getText();
	
	Assert.assertEquals("Booking Options", BookingTitle);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('startDate').value='2020-02-27'");
	js.executeScript("document.getElementById('endDate').value='2020-02-29'");

		
	js.executeScript("document.getElementById('select1').value='2'");
		
	
	js.executeScript("window.scrollBy(0,1800)");
	}
	public static void checkAvaibility() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[text()='Check Availability']")).click();
	}
	public static void personalDetails() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)");
	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("keshav");
	driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("kant");
	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("kantkeshav0409@gmail.com");
	driver.findElement(By.xpath("//*[@name='confirmemail']")).sendKeys("kantkeshav0409@gmail.com");
	driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("7003434701");
	js.executeScript("window.scrollBy(0,200)");
	driver.findElement(By.xpath("//*[@name='address']")).sendKeys("gurgaon");
	driver.findElement(By.xpath("//*[contains(@class,'chosen-container')]")).click();
	driver.findElement(By.xpath("//*[contains(@class,'chosen-search-input')]")).sendKeys("India");
	driver.findElement(By.xpath("(//*[text()='India'])[3]")).click();
	}
	public static void completeBooking() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[contains(@class,'completebook')]")).click();
			
	}
	public static void closeBrowser() {
		driver.close();
	}

}
