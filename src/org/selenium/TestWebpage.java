package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestWebpage {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.id(TestLocators.user)).sendKeys("Anucharu");
	driver.findElement(By.id(TestLocators.password)).sendKeys("1234567");
	driver.findElement(By.id(TestLocators.login)).click();
	Thread.sleep(2000);
WebElement locate = driver.findElement(By.id(TestLocators.location));
Select s=new Select(locate);
	s.selectByValue("Melbourne");

	WebElement hot = driver.findElement(By.id(TestLocators.hotel));
	Select s1=new Select(hot);
s1.selectByValue("Hotel Sunshine");

WebElement type = driver.findElement(By.id(TestLocators.type));
	Select s2=new Select(type);
	s2.selectByValue("Double");
	
	WebElement number = driver.findElement(By.id(TestLocators.number));
	Select s3=new Select(number);
	s3.selectByValue("3");
	
driver.findElement(By.id(TestLocators.checkin)).sendKeys("12/01/2022");
	driver.findElement(By.id(TestLocators.checkout)).sendKeys("14/01/2022");
	
	WebElement adult = driver.findElement(By.id(TestLocators.adults));
	Select s4=new Select(adult);
	s4.selectByValue("3");
	
	WebElement child = driver.findElement(By.id(TestLocators.children));
	Select s5=new Select(child);
	s5.selectByValue("4");
	
 driver.findElement(By.id(TestLocators.search)).click();
 
 driver.findElement(By.id(TestLocators.select)).click();

  driver.findElement(By.id(TestLocators.con)).click();

 Thread.sleep(2000);
 
  driver.findElement(By.id(TestLocators.first)).sendKeys("Hari");
 Thread.sleep(1500);
 driver.findElement(By.id(TestLocators.last)).sendKeys("Anusuya");
driver.findElement(By.id(TestLocators.address)).sendKeys("No:144,Shanmugam street,Mylapore,Chennai-04");
 driver.findElement(By.id(TestLocators.credit)).sendKeys("1234567891234567");
    WebElement credtype = driver.findElement(By.id(TestLocators.credittype));
 Select s6=new Select(credtype);
  s6.selectByValue("MAST");
  
WebElement expmont = driver.findElement(By.id(TestLocators.month));
  Select s7=new Select(expmont);
 s7.selectByValue("3");
  
  WebElement expyear = driver.findElement(By.id(TestLocators.year));
  Select s8=new Select(expyear);
  s8.selectByValue("2022");
 
  driver.findElement(By.id(TestLocators.cvv)).sendKeys("123");
  
  driver.findElement(By.id(TestLocators.book)).click();
  Thread.sleep(10000);
		
		String attribute = driver.findElement(By.id(TestLocators.order)).getAttribute("value");
		System.out.println(attribute);
	//	String text = orderno.getText();
	//	System.out.println(text);
	
	File file=new File("M:\\Aiite\\text.txt");
	boolean mkdir = file.mkdir();
	System.out.println(mkdir);

	//boolean newFile = file1.createNewFile();
//	System.out.println(newFile);
FileUtils.writeStringToFile(file, attribute);
  
  
  
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
