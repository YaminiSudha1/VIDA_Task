package com.hotstar.base;

import org.openqa.selenium.chrome.*;

import com.hotstar.util.TestUtil;

import java.io.*;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class TestBase{

public static WebDriver driver;
public static Properties prop;

//creating constructor to read properties and intializing prop varaiable.
public  TestBase () 
{
	try {
		prop= new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Yamini\\eclipse-workspace\\TestPom\\"
				+"src\\main\\java\\com\\hotstar\\config\\config.properties");
		prop.load(ip);
		
	}catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
}

//Creating a method for initialization - read property of browser
	
	public static void Initialization()
	{
		String browserName= prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{
		// System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		// Instantiate a ChromeDriver class
		 driver =new ChromeDriver();  
	}
		driver.manage().window().maximize(); // to maximize browser
		driver.manage().deleteAllCookies(); // to delete all cookies 
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS); // waiting period 
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS); // waiting period 
		
		driver.get(prop.getProperty("url"));
		
}}
