package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Depot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);

WebElement dep = driver.findElement(By.xpath("//a[text()='All Departments']"));
a.moveToElement(dep).perform();
Thread.sleep(2000);
WebElement heat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
a.moveToElement(heat).perform();
Thread.sleep(2000);

WebElement air = driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
a.moveToElement(air).perform();

driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']")).click();
	
	}
}
