package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHdfc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("login_page");
	Thread.sleep(1500);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567");
	driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	driver.findElement(By.id("fldPasswordDispId")).sendKeys("hari@1234");
	driver.findElement(By.xpath("//a[@onclick='return fLogon();']")).click();
	driver.switchTo().alert().accept();
	
	
	}

}

