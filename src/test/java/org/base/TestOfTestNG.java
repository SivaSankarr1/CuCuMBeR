package org.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestOfTestNG extends Base{
	
	@Parameters({"user","pass"})
	@Test
private void tc01(String username,String password) {
		browserLaunch();
		urlLaunch("https://www.facebook.com/login/");
		WebElement textuser = locator("id","email");
		sendText(textuser,username);
		WebElement textpass = locator("id","pass");
		sendText(textpass,password);
		WebElement login = locator("id","loginbutton");
		elementClick(login);
	}
}
