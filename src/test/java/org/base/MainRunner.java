package org.base;
import org.openqa.selenium.WebElement;
import org.sample.LoginPagePOM;
public class MainRunner extends Base{
public static void main(String[] args) throws InterruptedException {
	browserLaunch();
	urlLaunch("https://www.facebook.com/login.php/");
	LoginPagePOM L = new LoginPagePOM();
	WebElement username = L.getUsername();
	username.sendKeys("sam123@gmail.com");
	WebElement password = L.getPassword();
	password.sendKeys("abcd@123");
	WebElement login = L.getLogin();
	login.click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	username.clear();
	WebElement userName = locator("id","email");
	userName.sendKeys("raja123@gmail.com");
	WebElement Password = locator("id","pass");
	Password.sendKeys("xyz@123");
	login.click();
	Thread.sleep(2000);
	username.clear();
	username.sendKeys("sankar123@gmail.com");
}
}
