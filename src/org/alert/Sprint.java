package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sprint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.id("tntLinkToSprint")).click();
		driver.findElement(By.id("loginHeaderButton")).click();
		

}
}
