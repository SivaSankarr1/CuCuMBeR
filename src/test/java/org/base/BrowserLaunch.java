package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
public static void main(String[] args) {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
searchBox.sendKeys("iphone 13 pro max",Keys.ENTER);
List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));


for(int i=0;i<=elements.size();i++) {
	//String text = elements.get(i).getText();
	//System.out.println(text);
	
List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

	for(int j=0;j<18;j++) {
		String text = elements.get(i).getText();
		String prices = price.get(j).getText();
		System.out.println(text+"\t" +prices);
		i++;
}
}
}

}

