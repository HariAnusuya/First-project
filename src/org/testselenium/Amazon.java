package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void amaze() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	Actions a = new Actions(driver);
	WebElement accounts = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	a.moveToElement(accounts).perform();
	
//	WebElement sign = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
//	a.moveToElement(sign).perform();
	
	WebElement start = driver.findElement(By.xpath("//a[text()='Start here.']"));
	a.moveToElement(start).click().perform();
	
	WebElement signin = driver.findElement(By.xpath("(//a[@class='a-link-emphasis'])[1]"));
	a.moveToElement(signin).click().perform();
	
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("7358324273");
	
	WebElement con = driver.findElement(By.xpath("//input[@type='submit']"));
	con.click();
	
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("1234567");
	
	WebElement sub = driver.findElement(By.xpath("//input[@type='submit']"));
	sub.click();
	
	
	
	}
	public static void main(String[] args) {
		amaze();
	}

}
