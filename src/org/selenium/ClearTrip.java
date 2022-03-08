package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.xpath("//a[@href='/signin']"));
		signin.click();
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("harianusuya4@gmail.coom");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Smile!369");
//		WebElement one = driver.findElement(By.xpath("//a[@id='signuplink']"));
//		one.click();
		
		
		
}
	
}
