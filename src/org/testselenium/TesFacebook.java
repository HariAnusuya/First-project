package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver object=new ChromeDriver();
		object.get("https://www.facebook.com/");
//		WebElement sign = object.findElement(By.xpath("//a[@class='r2iyh']"));
//		sign.click();
//		WebElement mob = object.findElement(By.xpath("//input[@id='mobile']"));
//		mob.sendKeys("7358324273");
//		WebElement nam = object.findElement(By.xpath("//input[@id='name']"));
//		nam.sendKeys("Kalai");
//		WebElement email = object.findElement(By.xpath("//input[@id='email']"));
//		email.sendKeys("kalai4@gmail.com");
//		WebElement pass = object.findElement(By.xpath("//input[@id='password']"));
//		pass.sendKeys("542");
//		WebElement con = object.findElement(By.xpath("//a[@class='a-ayg']"));
//		con.click();
		
		WebElement user = object.findElement(By.id("email"));
		user.sendKeys("kalai");
		WebElement pass = object.findElement(By.id("pass"));
		pass.sendKeys("567890");

}
}
