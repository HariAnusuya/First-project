package org.preparation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		FileInputStream stream=new FileInputStream("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\src\\org\\preparation\\config.properties");
		Properties prop=new Properties();
		prop.load(stream);
		
		String browse=prop.getProperty("Browser");
		String DriverLoc = prop.getProperty("DriverLocation");
		
		if(browse.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", DriverLoc);
			driver = new ChromeDriver();
		}else {
			System.out.println("Error with the browser");
		}
		driver.get("https://www.google.co.in");
	}

}
