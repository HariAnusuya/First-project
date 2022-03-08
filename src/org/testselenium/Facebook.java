package org.testselenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void launchWebsites() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys("harianusuya");
	WebElement findElement = driver.findElement(By.id("pass"));
	findElement.sendKeys("1234");
	}
	public static void main(String[] args) {
		launchWebsites();
	}
}
