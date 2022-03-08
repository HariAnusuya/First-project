package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		Thread.sleep(1500);
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.moveToElement(mobiles).click().perform();
		Thread.sleep(1500);
		WebElement acessories = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
		a.moveToElement(acessories).perform();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Power Banks']")).click();
		

	}

}
