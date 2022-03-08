package org.tstselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver drive=new ChromeDriver();
	drive.get("http://adactin.com/HotelApp/");
	drive.manage().window().maximize();
//	WebElement newuser = drive.findElement(By.xpath("//a[@href='Register.php']"));
//	newuser.click();
//	WebElement user = drive.findElement(By.xpath("//input[@id='username']"));
//	user.sendKeys("Hanusuya");
//	WebElement pass = drive.findElement(By.xpath("//input[@id='password']"));
//	pass.sendKeys("hari@123");
//	WebElement repass = drive.findElement(By.xpath("//input[@id='re_password']"));
//	repass.sendKeys("hari@123");
//	WebElement fullname = drive.findElement(By.xpath("//input[@id='full_name']"));
//	fullname.sendKeys("HariAnusuya");
//	WebElement email = drive.findElement(By.xpath("//input[@id='email_add']"));
//	email.sendKeys("harianusuya4@gmail.com");
//	Thread.sleep(12000);
////	WebElement cap = drive.findElement(By.xpath("//input[@id='captcha-form']"));
////	cap.click();
//	WebElement terms = drive.findElement(By.xpath("//input[@id='tnc_box']"));
//	terms.click();
//	WebElement sub = drive.findElement(By.xpath("//input[@id='Submit']"));
//	sub.click();
//	WebElement log = drive.findElement(By.xpath("//a[@href='index.php']"));
//	log.click();
//	WebElement location = drive.findElement(By.name("location"));
//	Select s=new Select(location);
//	s.selectByIndex('4');
	WebElement user1 = drive.findElement(By.xpath("//input[@id='username']"));
	user1.sendKeys("Hanusuya");
	WebElement pass2 = drive.findElement(By.xpath("//input[@id='password']"));
	pass2.sendKeys("hari@123");
	WebElement log1 = drive.findElement(By.xpath("//input[@id='login']"));
	log1.click();
	
	WebElement location = drive.findElement(By.id("location"));
	Select s=new Select(location);
	s.selectByValue("London");
	
	WebElement hot = drive.findElement(By.id("hotels"));
	Select s1=new Select(hot);
	s1.selectByValue("Hotel Cornice");
	
	WebElement room = drive.findElement(By.id("room_type"));
	Select s2=new Select(room);
	s2.selectByValue("Deluxe");
	
	WebElement num = drive.findElement(By.id("room_nos"));
	Select s3=new Select(num);
	s3.selectByValue("4");
	
	WebElement in = drive.findElement(By.id("datepick_in"));
	in.sendKeys("20/12/2021");
	
	WebElement out = drive.findElement(By.id("datepick_out"));
	out.sendKeys("22/12/2021");
	
	WebElement adult = drive.findElement(By.id("adult_room"));
	Select s4=new Select(adult);
	s4.selectByValue("3");
	
	WebElement child = drive.findElement(By.id("child_room"));
	Select s5=new Select(child);
	s5.selectByValue("2");
	
//	WebElement search = drive.findElement(By.id("Submit"));
//	search.click();
	
//	WebElement sel = drive.findElement(By.id("radiobutton_0"));
//	sel.click();
//	
//	WebElement cont = drive.findElement(By.id("continue"));
//	cont.click();
//	
//	WebElement fir = drive.findElement(By.id("first_name"));
//	fir.sendKeys("Hari");
//	
//	WebElement last = drive.findElement(By.id("last_name"));
//	last.sendKeys("Anusuya");
//	
//	WebElement add = drive.findElement(By.id("address"));
//	add.sendKeys("No:144,shanmugam street,mylapore,chennai 04");
//	
//	WebElement credit = drive.findElement(By.id("cc_num"));
//	credit.sendKeys("1234567812345678");
//	
//	WebElement cc = drive.findElement(By.id("cc_type"));
//	Select s6=new Select(cc);
//	s6.selectByValue("VISA");
//	Thread.sleep(3000);
//	WebElement exp = drive.findElement(By.id("cc_exp_month"));
//	Select s7=new Select(exp);
//	s7.selectByValue("April");
//	
//	WebElement yr = drive.findElement(By.id("cc_exp_year"));
//	Select s8=new Select(yr);
//	s8.selectByValue("2022");
//	
//	WebElement cvv = drive.findElement(By.id("cc_cvv"));
//	cvv.sendKeys("1234");
//	
//	WebElement book = drive.findElement(By.id("book_now"));
//	book.click();
	}

}
