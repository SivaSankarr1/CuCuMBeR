package org.page;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Pom extends Base{
public Login_Page_Pom() {
PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement username;

@FindBy(id="password")
private WebElement password;

@FindBy(id="login")
private WebElement login;
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
public void login(String textUser,String textPass) {
	sendText(getUsername(),textUser);
	sendText(getPassword(),textPass);
}
public void loginClick() {
	elementClick(getLogin());
}
}
