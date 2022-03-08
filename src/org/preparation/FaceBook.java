package org.preparation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static WebDriver driver;
	public static void browserLaunch() throws IOException {

		Properties prop=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Config\\Facebook.properties");
		prop.load(fi);



		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\New Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.name("login")).click();
	}

	public static void main(String[] args) throws IOException {
		browserLaunch();
	}

}

