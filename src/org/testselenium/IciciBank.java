package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	WebElement a = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
	a.sendKeys("Anusuya");
	WebElement b = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	b.sendKeys("1234");
	
	}
	public static void main(String[] args) {
		launch();
	}
	
}
