package org.tstselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TspscGov {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver drive=new ChromeDriver();
	drive.get("https://tspsconetimereg.tspsc.gov.in/oneTimeRegistration.tspsc");
	drive.manage().window().maximize();
	WebElement aadhar = drive.findElement(By.xpath("//input[@id='aadhdarNo']"));
	aadhar.sendKeys("1234567891234");
	WebElement name = drive.findElement(By.xpath("//input[@id='aadhdarName']"));
	name.sendKeys("HariAnusuya");
	WebElement can = drive.findElement(By.xpath("//input[@id='candidateName']"));
	can.sendKeys("HariAnusuya");
	WebElement gen = drive.findElement(By.xpath("//input[@value='F']"));
	gen.click();
	WebElement dob = drive.findElement(By.xpath("//input[@id='dob']"));
	dob.sendKeys("12/03/1995");
	WebElement fat = drive.findElement(By.xpath("//input[@id='fatherName']"));
	fat.sendKeys("Kumar");
	WebElement mot = drive.findElement(By.xpath("//input[@id='motherName']"));
	fat.sendKeys("Mathi");
	WebElement  dis= drive.findElement(By.id("nativeDistrict"));
	Select s1=new Select(dis);
	s1.selectByVisibleText("Adilabad");
//	s1.selectByVisibleText("Hyderabad");
//	s1.selectByVisibleText("Karimnagar");
//	s1.selectByVisibleText("Khammam");
//	s1.selectByVisibleText("Mahabubnagar");
//	s1.selectByVisibleText("Medak");
//	s1.selectByVisibleText("Nalgonda");
//	s1.selectByVisibleText("Nizamabad");
//	s1.selectByVisibleText("Ranga Reddy");
//	s1.selectByVisibleText("Warangal");
//	s1.selectByVisibleText("Other than Telangana State");
	
	WebElement com = drive.findElement(By.id("community"));
	Select s=new Select(com);
	s.selectByValue("0");
//	s.selectByValue("1");
//	s.selectByValue("2");
//	s.selectByValue("3");
//	s.selectByValue("4");
//	s.selectByValue("5");
//	s.selectByValue("6");
//	s.selectByValue("7");
//	s.selectByValue("8");
	
	
	
	
	
	List<WebElement>  x = s.getOptions();
	for (WebElement y : x) {
		String z = y.getText();
System.out.println(z);
		
	}
	
	
//	WebElement nat = drive.findElement(By.id("nativeMandal"));
//	Select s2=new Select(nat);
//	s2.selectByValue("0");
//	
//	WebElement vill = drive.findElement(By.id("nativeVillage"));
//	vill.sendKeys("chennai");
	
	
}
	
}
