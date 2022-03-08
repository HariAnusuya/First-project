package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
	WebElement ok = driver.findElement(By.xpath("//div[@class='text-center col-xs-12']"));
	ok.click();
	WebElement sign = driver.findElement(By.xpath("//a[@class='ng-star-inserted']"));
	sign.click();
	WebElement register = driver.findElement(By.xpath("//label[@class='search_btn']"));
	register.click();
	
	
	
	
	
	}

}
