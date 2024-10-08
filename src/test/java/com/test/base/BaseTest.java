package com.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
	public WebDriver driver;

	public static String remote_url = "http://localhost:4444";
	public final static int TIMEOUT = 5;

	@BeforeMethod
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));

	}

	public WebDriver getDriver() {
		return driver;
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}