package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement dep = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(dep).perform();
		Thread.sleep(2000);
		
		WebElement paint = driver.findElement(By.xpath("(//a[@data-link='//www.homedepot.com/b/Paint-Ideas'])[1]"));
		a.moveToElement(paint).perform();
		Thread.sleep(2000);
		
		WebElement interior = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(interior).perform();
		
		driver.findElement(By.xpath("//a[text()='Ceiling Paint']")).click();
		
		
		
		
}
}
