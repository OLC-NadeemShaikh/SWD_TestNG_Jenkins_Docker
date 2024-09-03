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
	//protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	public static String remote_url = "http://localhost:4444";
	public final static int TIMEOUT = 5;

	WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {

		/*
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver.set(new RemoteWebDriver(new URL(remote_url), options));
		System.out.println("Browser Started : Chrome");

		driver.get().get("https://opensource-demo.orangehrmlive.com/");
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		*/
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		
	}
	public WebDriver getDriver() {
		return driver;
		//return driver.get();
	}

	/*
	@AfterMethod
	public void closeBrowser() {
		driver.get().quit();
		driver.remove();
	}
*/
}