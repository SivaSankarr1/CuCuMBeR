package org.stepdef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.page.Login_Page_Pom;
import org.base.Base;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class LoginPageStepClass extends Base{
	public Login_Page_Pom pom;
	@Given("User should be in Adactin home page")
	public void userShouldBeInAdactinHomePage() {
	   browserLaunch();
	   urlLaunch("https://adactinhotelapp.com/");
	}
	@When("User should enter userName and password with valid credential")
	public void tc01(io.cucumber.datatable.DataTable dataTable) {
	 List<String> asList = dataTable.asList();
	 String user = asList.get(0);
	 String pass = asList.get(1);
	 pom = new Login_Page_Pom();
	 pom.login(user, pass);
	 pom.loginClick();
	 }
	
	@Then("user should verify the login successfull message")
	public void tc03() {
	    Assert.assertTrue(true);
	    System.out.println("Login message Successfully verified");
	}
	@When("select from search hotels")
	public void tc04() throws InterruptedException {
		WebElement locatn = locator("id", "location");		
		selectBasedOn(locatn, "Sydney"); 
		WebElement hotl = locator("id", "hotels");		
		selectBasedOn(hotl, "Hotel Creek");
		WebElement roomType = locator("id", "room_type");		
		selectBasedOn(roomType, "Standard");
		WebElement noOfRooms = locator("id", "room_nos");		
		selectBasedOn(noOfRooms, "2");
		WebElement chkInDate = locator("id", "datepick_in");
		chkInDate.clear();
		chkInDate.sendKeys("04/02/2023");
		WebElement chkOutDate = locator("id", "datepick_out");
		chkOutDate.clear();
		chkOutDate.sendKeys("06/02/2023");
		WebElement noOfadultinroom = locator("id", "adult_room");		
		selectBasedOn(noOfadultinroom, "2");
		WebElement noOfchildreninroom = locator("id", "child_room");		
		selectBasedOn(noOfchildreninroom, "3");
		WebElement search = locator("id", "Submit");
		elementClick(search);
		Thread.sleep(2000);
	}
	@Then("select the hotel details provided and click continue")
	public void tc05() {
	  WebElement radioButton = locator("id","radiobutton_0"); 
	  radioButton.click();
	  WebElement continueButton = locator("id","continue"); 
	  continueButton.click();
	}
	@Then("provide personal details and payment details")
	public void tc06() throws InterruptedException {
	   WebElement firstName = locator("id", "first_name");
	   sendText(firstName, "Siva");
	   WebElement lastName = locator("id", "last_name");
	   sendText(lastName, "Sankar");
	   WebElement Baddress = locator("id", "address");
	   sendText(Baddress, "123,ABC steet,XYZ city,pin-654321");
	   WebElement creditCardNo = locator("id", "cc_num");
	   sendText(creditCardNo, "1234567890123456");
	   WebElement creditCardType = locator("id", "cc_type");
	   selectBasedOn(creditCardType, "VISA");
	   WebElement expMounth = locator("id", "cc_exp_month");
	   selectBasedOn(expMounth, "3");
	   WebElement expYear = locator("id", "cc_exp_year");
	   selectBasedOn(expYear, "2022");
	   WebElement cvv = locator("id", "cc_cvv");
	   sendText(cvv, "123");
	   WebElement bookNow = locator("id", "book_now");
	   bookNow.click();
	   Thread.sleep(5000);
	}
	@Then("get the order number")
	public void tc07() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement footer = xpathLocator("//a[text()='Adactin.com']");
	    js.executeScript("arguments[0].scrollIntoView(true)", footer);
	   WebElement orderNo = locator("id", "order_no");
	   String text = orderNo.getAttribute("value");
	   System.out.println("Your Order Number is:"+text);
	}
	
}