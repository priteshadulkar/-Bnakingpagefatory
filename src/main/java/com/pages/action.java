package com.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class action {
	 public  WebDriver driver ;
	
	public void startup()
	{
    
	
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver2.44\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.navigate().to("https://www.browserstack.com/");
	 Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	Assert.assertFalse(verifyTitle);
	}
	@Test
	public void asst()
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		 for(Map.Entry<Integer,String> map1 :map.entrySet())
		 {
			 System.out.println(map1.getKey());
			 System.out.println(map1.getValue());
		 }
		 public int compareTo(Student st)
		 {
			 
			 
		 }return name,compareeto(st.name)
				 
				 public Stiudent implemntss comparable
				 String roll;
		 String name
		 ;
		 public Student(String name , String roll)
		 {
			 
			 this.name= name ;
		 }
	}
	class age implemetsn compane <Student>
	public void compareble(Student st)
	{
		if(st.age==at.gae)
		{
			retyurn 0;
		}else
		{
			st.age>at,agre
			reutrn 2;
		}
			public String compare(st st) {
				return st.name.compate to(st,nbfbf)
			}
	}colection .sort(al.name )
	
	
	 public void softassert() {
		 SoftAssert softAssert = new SoftAssert();
	 String getActualTitle = driver.getTitle();
	 Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	 softAssert.assertEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	 System.out.println("SHFjafbjAFbsf");
	 softAssert.assertNotEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	 softAssert.assertNull(verifyTitle);
	 System.out.println("SHFjafbjAFbsf");
	 softAssert.assertNotNull(verifyTitle);
	 softAssert.assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
	 System.out.println("SHFjafbjAFbsf");
	 
	 softAssert.assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");
	 System.out.println("SHFjafbjAFbsf");
	 softAssert.assertAll();
	 
	
	 }
	}
	  

