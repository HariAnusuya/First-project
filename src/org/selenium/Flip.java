package org.selenium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	static String mobiles=null;
	static String price=null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement mob = driver.findElement(By.xpath("//input[@name='q']"));
		mob.sendKeys("realme mobile");
		
		mob.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> moblist = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
		List<WebElement> mobprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
for(int i=0;i<moblist.size();i++) {
	mobiles=moblist.get(i).getText();
	price=mobprice.get(i).getText();
	
	
	Map<String,String> ref=new HashMap<String, String>();
	ref.put(mobiles, price);
	Set<Entry<String, String>> entrySet = ref.entrySet();
	System.out.println(entrySet);
}

	}

}
