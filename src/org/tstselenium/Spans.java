package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spans {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		a.moveToElement(women).click().perform();
		
		WebElement foot = driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		a.moveToElement(foot).click().perform();
		
	driver.findElement(By.xpath("//span[text()='Heels for Women']")).click();
	
		

}
}
