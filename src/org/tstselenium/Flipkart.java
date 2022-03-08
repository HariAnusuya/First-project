package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		Thread.sleep(2500);
		WebElement women = driver.findElement(By.xpath("//div[text()='Fashion']"));
		a.moveToElement(women).click();
		
		WebElement foot = driver.findElement(By.xpath("//a[@class='_1jJQdf _2Mji8F']"));
		a.moveToElement(foot).click();
		
		driver.findElement(By.xpath("//a[text()='Flats']")).click();


}
}
                 