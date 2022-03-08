package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver drive=new ChromeDriver();
		drive.get("www.adactin.com/HotelApp/");
		WebElement user = drive.findElement(By.id("username"));
		user.sendKeys("Anusuya");
		WebElement pass = drive.findElement(By.id("password"));
		pass.sendKeys("1234");
	}
	
}