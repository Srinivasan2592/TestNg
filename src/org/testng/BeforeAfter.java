package org.testng;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfter {
	WebDriver driver;
	long startbroswer;
	long endbrowser;

	@BeforeSuite
	private void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Srinivasan\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		startbroswer = System.currentTimeMillis();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	private void google() {
		driver.get("https://www.google.com/");
	}

	@Test(priority = 2)
	private void facebook() {
		driver.get("https://www.facebook.com/");
	}

	@Test(priority = 3)
	private void twitter() {
		driver.get("https://twitter.com/login");
	}

	@Test(enabled = false)
	private void Adactinhotel() {
		driver.get("https://adactinhotelapp.com/");
	}

	@Test(enabled = false)
	private void youtube() {
		driver.get("https://www.youtube.com/");

	}

	@AfterSuite
	private void Closebrowser() {
		driver.quit();
		endbrowser = System.currentTimeMillis();
		long totaltime = startbroswer - endbrowser;
		System.out.println("Total time taken" + totaltime);

	}

}
