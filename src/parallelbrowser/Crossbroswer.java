package parallelbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbroswer {
	WebDriver driver;

	@Parameters({ "Browser" })
	@Test
	private void listofbrowser(String s1) {
		if (s1.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		}

		else if(s1.equals("internet explorer"))
		{
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		}
			
		else if (s1.equals("Firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			
			
			
		}
	}

}
