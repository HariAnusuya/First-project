package org.preparation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Facebooks {
	public static void launch() throws IOException {
		Properties prop=new Properties();
		FileInputStream fi= new FileInputStream("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Config\\Facebooks.properties");
		prop.load(fi);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("Password"));
		
		
		System.out.println(prop.setProperty("username", "MyLove"));
		
		System.out.println(prop.setProperty("Password", "Urmyangel"));
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Config\\Facebooks.properties");
		prop.store(fo, null);
	}
public static void main(String[] args) throws IOException {
	launch();
}
}
