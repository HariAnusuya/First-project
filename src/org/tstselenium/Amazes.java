package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement sign = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		a.moveToElement(sign).perform();
		
		 driver.findElement(By.xpath("(//a[@class='nav-a'])")).click();
		 
		 WebElement signin = driver.findElement(By.xpath("(//a[@class='a-link-emphasis'])[1]"));
a.moveToElement(signin).click().perform();

WebElement mob = driver.findElement(By.id("ap_email"));
mob.sendKeys("7358324273");

WebElement con = driver.findElement(By.id("continue"));
con.click();

WebElement pass = driver.findElement(By.id("ap_password"));
pass.sendKeys("hari@1234");

WebElement submit = driver.findElement(By.id("signInSubmit"));
submit.click();
	
	
	}
}
