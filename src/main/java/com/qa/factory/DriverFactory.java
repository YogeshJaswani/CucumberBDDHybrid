package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

 
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<WebDriver>();
	
	
	public WebDriver init_driver(String browser)
	{
		System.out.println("Browser name is "+browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());			
		}
		else
		{
			System.out.println("Please eneter correct browser name as "+browser);
		}
		
		driver= getDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static WebDriver getDriver()
	{
		 return tlDriver.get();
	}
}
