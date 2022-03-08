package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.snapdeal.com/");
WebElement Sign = driver.findElement(By.xpath("//div[@class='accountInner']"));
Sign.click();
WebElement drop = driver.findElement(By.xpath("//div[@class='dropdownAccountNonLoggedIn']"));
drop.click();

WebElement mobile = driver.findElement(By.xpath("//input[@class='col-xs-24']"));
mobile.sendKeys("7358324273");
WebElement con = driver.findElement(By.xpath("//button[@id='checkUser']"));
con.click();


}
}
