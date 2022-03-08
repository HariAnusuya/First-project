package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Samsung {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.samsung.com/in/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement mob = driver.findElement(By.xpath("//span[text()='Mobile']"));
a.moveToElement(mob).click().perform();
WebElement smart = driver.findElement(By.xpath("(//span[@class='gnb__depth2-link-text'])[2]"));
a.moveToElement(smart).click().perform();

WebElement galaxy = driver.findElement(By.xpath("(//span[@class='gnb__depth3-link-text'])[2]"));
a.moveToElement(galaxy).click().perform();
Thread.sleep(3000);

driver.findElement(By.xpath("(//a[@class='cta cta--contained cta--black'])[3]")).click();
 
 
 driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
 
 driver.findElement(By.xpath("(//span[text()='Continue'])[1]")).click();
	}


}
