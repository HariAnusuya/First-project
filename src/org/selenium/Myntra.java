package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	driver.manage().window().maximize();
WebElement signup = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
signup.sendKeys("7358324273");
WebElement con = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
con.click();
//	WebElement login = driver.findElement(By.xpath("//button[@class='btn default   block socialLoginButton firstButton']"));
//	login.sendKeys("harianusuya4@gmail.com");
	WebElement pro = driver.findElement(By.xpath("//div[@data-reactid='825']"));
	pro.click();
	//driver.findElement(By.xpath(""))
	
}
}
