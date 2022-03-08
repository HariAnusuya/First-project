package org.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static void browserLaunch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
    driver.get("https://www.facebook.com/");
	//driver.get("https://www.amazon.in");
	}
	public static void main(String[] args) {
		browserLaunch();
	}

}
