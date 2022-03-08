package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement sign = driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
		a.moveToElement(sign).perform();;
		Thread.sleep(2500);

		 driver.findElement(By.xpath("//a[text()='Start here.']")).click();
		
		Thread.sleep(3500);
		
		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("HariAnusuya");
		
		WebElement mob = driver.findElement(By.id("ap_email"));
		mob.sendKeys("7358324273");	
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("haari@1234");
		
		WebElement checkpass = driver.findElement(By.id("ap_password_check"));
		checkpass.sendKeys("haari@1234");
		
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		
}
}
