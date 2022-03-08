package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement mob = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		a.moveToElement(mob).perform();
		Thread.sleep(1500);
		
		WebElement view = driver.findElement(By.xpath("(//span[text()='View All'])[23]"));
		a.moveToElement(view).click().perform();
		Thread.sleep(1500);
		
		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-selected']"));
		sort.click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("(//li[@data-index='4'])[2]")).click();

}
}
