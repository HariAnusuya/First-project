package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loaders {
	static String names=null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bobcat.com/in/en/index");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[@class='btn accept']")).click();
	
	driver.findElement(By.xpath("//a[text()='Loaders']")).click();
	
	driver.findElement(By.xpath("(//span[@class='dtm-pro-grp-txt-name'])[1]")).click();
	
	List<WebElement> load = driver.findElements(By.xpath("//div[@class='h5 dtm-pro-grp-lst-name']"));
	Thread.sleep(2000);
	
	for (WebElement listnames : load) {
		System.out.println(listnames.getText());
		
	}
}
}
