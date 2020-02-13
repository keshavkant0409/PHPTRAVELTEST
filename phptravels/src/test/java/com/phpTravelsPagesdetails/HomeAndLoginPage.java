package com.phpTravelsPagesdetails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class HomeAndLoginPage {
	public static WebDriver driver;

	public static void launchWebBrowser() {
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		driver = new FirefoxDriver();
		String BaseURL = "https://www.phptravels.net/home";
		driver.get(BaseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void myAccountLogin(String uname, String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[@id='dropdownCurrency'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'loginbtn')]")).click();

	}

	public static void validateLogin() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(@href,'profile')]")).click();

		String name = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		System.out.println("My name is:" + name);

		String titlename = driver.findElement(By.xpath("//h3[@class='text-align-left']")).getText();

		System.out.println("Wlcome page after Login:" + titlename);
		Assert.assertEquals(titlename.contains(name), true);

		driver.findElement(By.xpath("//a[contains(@title,'home')]")).click();

	}

	public static void subscribeNewsletter(String email) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement SubscribeButton = driver.findElement(By.xpath("//button[text()='Subscribe']"));
		js.executeScript("arguments[0].scrollIntoView();", SubscribeButton);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys(email);
		
		SubscribeButton.click();
		

	}

	public static void validateNewsletterSubscription() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='wow fadeIn subscriberesponse']")));
		WebElement fadeInsubscriberesponse = driver.findElement(By.xpath("//div[@class='wow fadeIn subscriberesponse']"));
		String subscriptionresponse = fadeInsubscriberesponse.getText();
		System.out.println("subscription response:" + subscriptionresponse);

	}

	public static void closeBrowser() {
		driver.close();
	}
}
