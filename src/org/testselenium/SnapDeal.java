package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver source=new ChromeDriver();
	source.get("https://www.snapdeal.com/login");
	source.manage().window().maximize();
	WebElement mobile = source.findElement(By.id("userName"));
	mobile.sendKeys("harianusuya4@gmail.com");
	}

}
