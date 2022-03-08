package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
	public static void sprint() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement close = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		close.click();
		
		WebElement close2 = driver.findElement(By.xpath("//i[@class='fa fa-times-circle']"));
		close2.click();
		
		WebElement account = driver.findElement(By.xpath("//button[@class='nav__link nav__link-button dropdown-toggles nav__link-button-desktop MAGENTA']"));
		a.moveToElement(account).click().perform();
		WebElement paybill = driver.findElement(By.xpath("//a[text()=' Bill pay ']"));
		a.moveToElement(paybill).click().perform();
		
	}
public static void main(String[] args) {
	sprint();
}
}
