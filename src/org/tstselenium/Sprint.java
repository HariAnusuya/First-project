package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();driver.findElement(By.xpath("(//button[@aria-label='Close'])[3]")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-times-circle']")).click();
		
		Actions a=new Actions(driver);
		WebElement log = driver.findElement(By.xpath("(//iframe[@aria-hidden='true'])[2]"));
		a.moveToElement(log).click().perform();
		
	Thread.sleep(2000);
	
	driver.findElement(By.id("user-link-dropdown-item-category-name-1-0-0")).click();
		
		

}
}
