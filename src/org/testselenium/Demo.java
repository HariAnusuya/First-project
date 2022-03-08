package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void demoAuto() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hari");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Anusuya");
		Thread.sleep(3000);
		WebElement add = driver.findElement(By.xpath("//textarea[@rows='3']"));
		add.sendKeys("No:144, shanmugam street,mylapore,chennai04");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("harianusuya4@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7358324273");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		WebElement lan = driver.findElement(By.id("msdd"));
		Actions a=new Actions(driver);
		a.moveToElement(lan).click().perform();
		
		
		WebElement skills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		Select s=new Select(skills);
		s.selectByValue("Adobe Photoshop");
		
		WebElement country = driver.findElement(By.id("countries"));
		Actions b=new Actions(driver);
		b.moveToElement(country).click().perform();
		Select s1=new Select(country);
		s1.selectByVisibleText("Select Country");
		
		WebElement selectcountry = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		Actions c=new Actions(driver);
		c.moveToElement(selectcountry).click();
		c.moveToElement(selectcountry).click().perform();
		
//		WebElement drop = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
//		drop.click();
		
		WebElement year = driver.findElement(By.xpath("//select[@ng-model='yearbox']"));
		Select s2=new Select(year);
		s2.deselectByVisibleText("1995");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s3=new Select(month);
		s3.selectByIndex(3);
		
		WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		Select s4=new Select(day);
		s4.selectByIndex(3);
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Hari@123");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Hari@123");
		
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
		
		
	}
public static void main(String[] args) throws InterruptedException {
	demoAuto();
}
}
