package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hdfc {
	public static void browserLaunch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://netbanking.hdfcbank.com/");
	driver.manage().window().maximize();
	WebElement customerid = driver.findElement(By.id("fldLoginUserId"));
	customerid.sendKeys("harianusuya");
	}
public static void main(String[] args) {
	browserLaunch();
}
}
