package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base extends BaseClassForReadExcelSheet {
public static WebDriver driver;
	
public static void browserLaunch() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		driver.manage().window().maximize();
}
public static void urlLaunch(String url) {
	driver.get(url);
}
public static WebElement locator(String attributeName,String attributeValue) {	
	if(attributeName.equalsIgnoreCase("id")) {
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}
	else if(attributeName.equalsIgnoreCase("name")) {
		WebElement findElement = driver.findElement(By.name(attributeName));
		return findElement;
	}
	else {
		return null;
	}}
	public static WebElement xpathLocator(String xpathExpression) {
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;
		}
	public static void  sendText(WebElement element,String keyToSend) {
	element.sendKeys(keyToSend);
		}
	public static void elementClick(WebElement element) {
				element.click();	
	}
	public static void selectBasedOn(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);	
		}
		
	}