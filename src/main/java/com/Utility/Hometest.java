package com.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Test.TestBase;
import com.pages.Homepages;

public class Hometest extends TestBase  {

	
	
	public Hometest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	Homepages phome = PageFactory.initElements(driver, Homepages.class);
	TestBase re = PageFactory.initElements(driver, TestBase.class);
	
	
	@BeforeMethod
	public void startup() throws IOException
	{
	   re.readproperties();
	 
	 
	}

	//@Test
	public void searchStation() throws Exception
	{
		
		//phome.Homeloginsource("Delhi");
		//phome.Homeloginsource("Germ");
		//phome.serachcontent();
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
