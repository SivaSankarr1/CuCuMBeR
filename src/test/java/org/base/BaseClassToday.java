package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassToday {
public static WebDriver driver;

public static void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	}
public static void launchUrl(String Url) {
	driver.get(Url);
}

public static WebElement idLocator(String attributeValue) {
	WebElement findElement = driver.findElement(By.id(attributeValue));
	
	return findElement;
	
}
public static WebElement nameLocator(String attributeValue ) {
	WebElement findElement = driver.findElement(By.name(attributeValue));
	
	return findElement;
	
}
public static WebElement xpathLocator(String Expression) {
	WebElement findElement = driver.findElement(By.xpath(Expression));
	return findElement;
	
}
public static void elementTextSend(WebElement element,String keytoSend) {
	element.sendKeys(keytoSend);
}
public static void elementclick(WebElement element) {
	
	element.click();
}
}
