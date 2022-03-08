package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement edit = driver.findElement(By.xpath("//a[@data-nav='nav_Editorial']"));
		a.moveToElement(edit).click().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Entertainment']")).click();
	

}
}
