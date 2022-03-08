package org.preparation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Employee {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\New Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("admin123");
		WebElement log = driver.findElement(By.xpath("//input[@class='button']"));
		log.click();

//		TakesScreenshot a = (TakesScreenshot) driver;
//		File src = a.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshotdest.jpeg");
//		FileUtils.copyFile(src, dest);
		
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select s=new Select(drop1);
		s.selectByIndex(0);

	}

}
