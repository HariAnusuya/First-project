package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(1500);
	a.accept();
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(1500);
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	driver.switchTo().alert().sendKeys("Hari Anusuya");
	driver.switchTo().alert().accept();
	
	
	}

}
