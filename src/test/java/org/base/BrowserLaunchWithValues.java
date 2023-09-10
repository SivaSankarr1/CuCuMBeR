package org.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserLaunchWithValues extends DataProviderClassToday {
	@Test(dataProvider="Logindatas",dataProviderClass=DataProviderClassToday.class)
	private void tc01(String username,String password) {
		browserLaunch();
		urlLaunch("https://www.facebook.com/login/");
		WebElement user = locator("id","email");
		sendText(user,username);
		WebElement pass = locator("id","pass");
		sendText(pass,password);
		WebElement loginButton = locator("name","login");
		elementClick(loginButton);
	}
}
