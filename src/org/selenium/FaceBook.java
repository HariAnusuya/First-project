package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("Hari");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("1234");
		WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
		button.click();
		
		
	}
}

