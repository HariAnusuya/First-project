package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shops {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(sports).click().perform();
		
		WebElement weigh = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		a.moveToElement(weigh).click().perform();

}
}
