package org.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Registration {
	public static void register() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	}
public static void main(String[] args) {
	register();
}
}
