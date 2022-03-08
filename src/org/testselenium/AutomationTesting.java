package org.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	public static void automationTesting() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
}
	public static void main(String[] args) {
		automationTesting();
		
	}
}
