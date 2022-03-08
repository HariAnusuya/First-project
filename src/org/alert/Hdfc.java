package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hdfc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("login_page");
	Thread.sleep(1500);
	Actions a=new Actions(driver);
	
	
	WebElement con = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
	a.moveToElement(con).click().perform();
	Thread.sleep(1500);
	
	driver.switchTo().alert().accept();

	}
}
