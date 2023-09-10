package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;

public class ParallelExecutionClassToday {
public WebDriver driver;
@Test	
private void test1() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("www.google.com");
	System.out.println("Test1");
}
@Test
private void test2() {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("www.google.com");
	System.out.println("Test2");
}
@Test
private void test3() {
	WebDriverManager.operadriver().setup();
	WebDriver driver = (WebDriver) new OperaDriverManager();
	driver.get("www.google.com");
	System.out.println("Test3");
}
@Test
private void test4() {
	System.out.println("Test4");
}
@Test
private void test5() {
	System.out.println("Test5");
}
	
@Test
private void test6() {
System.out.println("test6");
}
}
