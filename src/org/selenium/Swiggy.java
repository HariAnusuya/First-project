package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement sign = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		sign.click();
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("7358324273");
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Anu");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("harianusuya4@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("1234567");
		WebElement con = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		con.click();
}
}
