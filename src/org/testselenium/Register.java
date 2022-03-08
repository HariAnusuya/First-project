package org.testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
firstname.sendKeys("hari");
WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
lastname.sendKeys("anusuya");
WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
address.sendKeys("No.144,gandhi nagar,mylapore,chennai");
WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
email.sendKeys("harianusuya4@gmail.com");
WebElement number = driver.findElement(By.xpath("//input[@type='tel']"));
number.sendKeys("7358324273");
WebElement gender = driver.findElement(By.xpath("//input[@value='FeMale']"));
gender.click();
WebElement hobbies = driver.findElement(By.xpath("//input[@value='Cricket']"));
hobbies.click();
WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
password.sendKeys("hari");
WebElement confirmpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
confirmpass.sendKeys("hari");
WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
submit.click();




}
}
