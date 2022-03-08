package org.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebook {
	public static void browser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	}
public static void main(String[] args) {
	browser();
}
}
