package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void launchWebsites() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	WebElement element = driver.findElement(By.id("src"));
	element.sendKeys("Chennai");
	WebElement findElement = driver.findElement(By.id("dest"));
	findElement.sendKeys("Madurai");
}
	public static void main(String[] args) {
		launchWebsites();
	}
}
