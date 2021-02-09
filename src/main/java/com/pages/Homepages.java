package com.pages;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Test.TestBase;

public class Homepages extends TestBase{

	
	
	public Homepages(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}

	
	
	WebDriver driver ;
	@FindBy(how= How.XPATH ,using = "//span[text()='One way']")
	public WebElement link;
	
	@FindBy(how= How.XPATH , using =" //input[@id='gosuggest_inputSrc']")
	public WebElement source ;
	
	@FindBy(how= How.XPATH , using ="//input[@id='gosuggest_inputDest']")
	public WebElement distination ;
	
	    
	@FindBy(how= How.XPATH ,using ="//button[@id='gi_search_btn']")
	public WebElement search;
	
	
	
	/*Homepages phome = PageFactory.initElements(driver, Homepages.class);
	TestBase re = PageFactory.initElements(driver, TestBase.class);      
	
	public Homepages(WebDriver driver) {  
       
	
	
	}

  public void Homeloginsource() throws InterruptedException, IOException
  {
		System.out.println("bsfjbs");
	 re.readproperties();
	  System.out.println("ndfnsdfnasnfaskdfkasdnfas");
	   
	 phome.source.sendKeys("Delh");
	 // using key commnad 
	 phome.source.sendKeys(Keys.ARROW_DOWN);
	 phome.source.sendKeys(Keys.ARROW_DOWN);
	 Thread.sleep(2000L);
	 phome.source.sendKeys(Keys.ENTER);
	 System.out.println("user select source station");
	 }
  
  @Test
  public void HomeLogindistanation(String distanation) throws InterruptedException, IOException
  {
	  re.readproperties();
	  phome.distination.sendKeys(distanation);
	  phome.distination.sendKeys(Keys.ARROW_DOWN);
	  phome.distination.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(2000);
	  phome.distination.sendKeys(Keys.ENTER);
	  System.out.println("user select  distantion");
	  
  }
  public void serachcontent()
  {
	  phome.search.click();

	  System.out.println("search button clicked user find a flight ");
	  
  }
	 */
	
	@Test
	public void Login() throws IOException
	{
		Homepages phome = PageFactory.initElements(driver, Homepages.class);
		TestBase re = PageFactory.initElements(driver, TestBase.class);
		re.readproperties();
		
		
	}
}
