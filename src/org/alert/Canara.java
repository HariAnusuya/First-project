package org.alert;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canara {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File file=new File("C:\\Users\\ELCOT\\eclipse-workspace\\NewProjectName\\src\\test\\resources\\Screenshots.jpeg");
		FileUtils.copyFile(src, file);
		
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(1500);
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
		
		
		
	}

}
