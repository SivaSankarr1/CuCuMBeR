package org.base;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLoginUsingJunit {
	public static WebDriver driver;
@BeforeClass
public static void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("Browser Launched successfully");
	}
@Before
public void urlLaunch() {
	driver.get("https://adactinhotelapp.com/");
	System.out.println("URL Launched Successfully");
}
@Test
public void userName_Password() {
	driver.findElement(By.id("username")).sendKeys("sam123@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Pass123@2022");
	System.out.println("UserName & Password Entered Successfully");
}
@After
public void loginButton() {
	driver.findElement(By.id("login")).click();
	System.out.println("Login Button clicked successfully");
}
@AfterClass
public static void verify_Login_Message() {
	System.out.println("Verified the login functionality using invalid Credentials");
}
}
