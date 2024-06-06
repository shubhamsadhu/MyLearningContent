package com.mmt.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		String input = "Chrome";
		if (input.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com");
		} else if (input.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com");
		} else if (input.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();

		} else {
			System.out.println("driver is not found");
		}
		driver.get("https://www.makemytrip.com");
	}

	public void waitforElementAppear(WebElement webelement) {
		WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wdwait.until(ExpectedConditions.visibilityOf(webelement));
	}
}