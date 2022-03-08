package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void redBus() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/ ");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Theni");
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Coimbatore");
	}
	public static void main(String[] args) {
		redBus();
	}

}
