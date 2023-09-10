package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunnerClass3 {
	@Parameters({"browser"})
	@Test
	private void test1(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login/");
		} else {
			WebDriverManager.edgedriver().setup();
			WebDriver driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
		}
			
	}
}
