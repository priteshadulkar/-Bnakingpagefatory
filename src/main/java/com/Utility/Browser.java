package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Browser {

	public Browser(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this); 
	}
	
protected static WebDriver driver ;
	public static Properties pro = new Properties() ;
	
	
	
	public void LanuchBrowser() throws FileNotFoundException
	{
		System.out.println(" start execution");

	
  FileInputStream fis = new FileInputStream("D:\\JenkinsWorkspace\\-Bnakingpagefatory\\src\\main\\java\\com\\configur\\PropertiesFile");
	 
      try
      {
    	 pro.load(fis); 
    	  
    	  //"D:\\JenkinsWorkspace\\BDDFreamwork\\src\\main\\java\\com\\configur\\PropertiesFile"
	 System.out.println("file read successfully");
	}
	 
	 catch(Exception e)
	 {
		 e.printStackTrace();
		 
		 System.out.println("file not found exception");
	 }
	  String Browsername = pro.getProperty("Browser"); 
	  System.out.println(Browsername);
	 if(Browsername.equals("Chrome")) 
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to(pro.getProperty("url"));
		 driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  System.out.println("Home page is open successfully");
//		 JavascriptExecutor exe = (JavascriptExecutor)driver;
//		 exe.executeScript("window.scrollBy(0,100)");
		  
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		 // driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']")).click();
	 }
	 else {
		 
		 
		 System.out.println("Home page is not open ");
	 }
		
	}
	
	
	
	
	
	
}
