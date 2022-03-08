package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//input[@id='navbar_username']"));
		user.sendKeys("Anusuya");
		WebElement pass = driver.findElement(By.xpath("//input[@id='navbar_password']"));
		pass.sendKeys("123456");
		WebElement lab = driver.findElement(By.xpath("//label[@for='cb_cookieuser_navbar']"));
		lab.click();
		WebElement log = driver.findElement(By.xpath("//input[@value='Log in']"));
		log.click();
	}

}
