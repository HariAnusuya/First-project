package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amaze {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement all = driver.findElement(By.xpath("(//span[text()='All'])[2]"));
		all.click();
		Thread.sleep(2000);
		
		WebElement shop = driver.findElement(By.xpath("//div[text()='shop by department']"));
		a.moveToElement(shop).perform();
		Thread.sleep(2000);
		
		WebElement mens = driver.findElement(By.xpath("//a[@data-menu-id='10']"));
		a.moveToElement(mens).click().perform();
		
		driver.findElement(By.xpath("(//a[text()='Sunglasses'])[1]")).click();
		
		


}
}