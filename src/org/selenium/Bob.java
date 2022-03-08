package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bob {
	static String names=null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bobcat.com/in/en/index");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	
	 driver.findElement(By.xpath("//a[@class='btn accept']")).click();
	 

	

	
	WebElement com = driver.findElement(By.xpath("(//a[text()='Compact Excavators'])[1]"));
	a.click(com).perform();
	

	
	 List<WebElement> excavator = driver.findElements(By.xpath("//div[@class='h5 dtm-pro-grp-lst-name']"));
	 Thread.sleep(2000);

	 
	 for (WebElement ref : excavator) {
		 System.out.println(ref.getText());
		
	}
	}

}
