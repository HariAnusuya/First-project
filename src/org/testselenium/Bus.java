package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bus {
	public static void red_Bus() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement close = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		close.click();
		
		WebElement close2 = driver.findElement(By.xpath("//i[@class='fa fa-times-circle']"));
		close2.click();
		
		WebElement plans = driver.findElement(By.xpath("//a[@class='nav__link ng-tns-c59-1']"));
		a.moveToElement(plans).perform();
		
		WebElement unlimited = driver.findElement(By.xpath("//span[text()='Unlimited Age 55+']"));
		a.moveToElement(unlimited).click().perform();
		
	}
	public static void main(String[] args) {
		red_Bus();
		
	}

}
