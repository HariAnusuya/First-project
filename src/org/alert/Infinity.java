package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Infinity {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.id("DUMMY1"));
	user.sendKeys("Hari Anusuya");
	user.click();
	Thread.sleep(1500);
	driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("1234567");
	
	driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
	
	driver.switchTo().alert().accept();

}
}
