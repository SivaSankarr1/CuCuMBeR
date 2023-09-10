package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinSendValueFromExcelSheet {
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	File file = new File("C:\\Users\\$AM$ANKAR\\Pictures\\Screenshots\\data.xlsx");
	FileInputStream input = new FileInputStream(file);
	Workbook book = new XSSFWorkbook(input);
	Sheet sheet = book.getSheet("Sheet1");
	Row row = sheet.getRow(1);
	//Username
	Cell uname = row.getCell(0);
	String Dusername = uname.getStringCellValue();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys(Dusername);
	System.out.println(Dusername);
	//Password
	Cell password = row.getCell(1);
	Cell Firstname = row.getCell(4);
	String DFirstname = Firstname.getStringCellValue();
	Cell Lastname = row.getCell(5);
	String DLastname = Lastname.getStringCellValue();
	Cell billingaddress = row.getCell(6);
	String Dbillingaddress = billingaddress.getStringCellValue();
	
	String Dpass = password.getStringCellValue();
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys(Dpass);
	System.out.println(Dpass);
	//Login
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	Thread.sleep(2000);
	//Selecting from list
	WebElement location = driver.findElement(By.id("location"));
	Select s = new Select(location);
	s.selectByIndex(1);
	WebElement hotels = driver.findElement(By.id("hotels"));
	Select s1 = new Select(hotels);
	s1.selectByValue("Hotel Sunshine");
	WebElement roomType = driver.findElement(By.id("room_type"));
	Select s2 = new Select(roomType);
	s2.selectByVisibleText("Standard");
	WebElement noOfRooms = driver.findElement(By.id("room_nos"));
	Select s3 = new Select(noOfRooms);
	s3.selectByVisibleText("4 - Four");
	
	//CheckInDate
	WebElement checkInDate1 = driver.findElement(By.id("datepick_in"));
	checkInDate1.clear();
	checkInDate1.sendKeys("15/01/2023");
	//CheckOutDate
	WebElement checkOutDate1 = driver.findElement(By.id("datepick_out"));	
	checkOutDate1.clear();
	checkOutDate1.sendKeys("18/01/2023");
	
	WebElement noOfAdult = driver.findElement(By.id("adult_room"));
	Select s4 = new Select(noOfAdult);
	s4.selectByValue("2");
	WebElement noOfChild = driver.findElement(By.id("child_room"));
	Select s5 = new Select(noOfChild);
	s5.selectByVisibleText("2 - Two");
	WebElement search = driver.findElement(By.id("Submit"));
	search.click();
	Thread.sleep(2000);
	WebElement radioclick = driver.findElement(By.id("radiobutton_0"));
	radioclick.click();
	WebElement continuebutton = driver.findElement(By.id("continue"));
	continuebutton.click();
	Thread.sleep(2000);
		
	
	WebElement fname = driver.findElement(By.id("first_name"));
	fname.sendKeys(DFirstname);
	
	WebElement lname = driver.findElement(By.id("last_name"));
	lname.sendKeys(DLastname);
	WebElement billingaddress1 = driver.findElement(By.id("address"));
	billingaddress1.sendKeys(Dbillingaddress);
	Thread.sleep(2000);
	WebElement creditcardNo1 = driver.findElement(By.id("cc_num"));
	creditcardNo1.sendKeys("1234567890123456");
	WebElement ccardtype = driver.findElement(By.id("cc_type"));
	Select s6 = new Select(ccardtype);
	s6.selectByVisibleText("VISA");
	WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
	Select s7 = new Select(expmonth);
	s7.selectByVisibleText("April");
	WebElement expyear = driver.findElement(By.id("cc_exp_year"));
	Select s8 = new Select(expyear);
	s8.selectByValue("2014");
	WebElement cvv1 = driver.findElement(By.id("cc_cvv"));
	cvv1.sendKeys("300");
	WebElement booknow = driver.findElement(By.id("book_now"));
	booknow.click();
	Thread.sleep(3000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	WebElement searchHotel = driver.findElement(By.id("search_hotel"));
	js.executeScript("arguments[0].ScrollIntoView(true)", searchHotel);
	
	String text = searchHotel.getText();
	System.out.println(text);
	
}
}