package org.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClassToday extends Base {

@DataProvider(name="Logindatas")
private Object[][] getDatas(){
	return new Object[][] {
		{"sam123@gmail.com","sam123"},	
		{"ram123@gmail.com","ram123"},	
		{"bheema123@gmail.com","Bheema123"},	
		{"Jackey123@gmail.com","Jackey123"},	
		
	};
	
}
/*
@Test(dataProvider="Logindatas")
private void tc01(String username,String password) {
	browserLaunch();
	urlLaunch("https://www.facebook.com/login/");
	WebElement user = locator("id","email");
	sendText(user,username);
	WebElement pass = locator("id","pass");
	sendText(pass,password);
	WebElement login = locator("name","login");
	elementClick(login);
}*/
	
}
