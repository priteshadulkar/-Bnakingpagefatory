package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Browser;

public class Onewaypage   {
// we write here only xpath and varible declare here 
	// only home page varible we can write 
	      
	
	
	protected static WebDriver driver;
	Browser bs = new Browser(driver);
	public Onewaypage(WebDriver driver)
	{
		this.driver= driver;
	      PageFactory.initElements(driver, this);  
	}
	
	@FindBy(how=How.XPATH ,using ="//span[@id='roundTrip']")
    WebElement oneway;
	@FindBy(how= How.XPATH , using ="//input[@id='gosuggest_inputSrc']")
	 WebElement source ;
	@FindBy(how= How.XPATH , using ="//input[@id='gosuggest_inputDest']")
	 WebElement dist;
	@FindBy(how =How.XPATH , using ="//input[@id='departureCalendar']")
    WebElement date;
	@FindBy(how =How.XPATH , using ="//div[@class='DayPicker-Month']//following::div[@class='DayPicker-Day']")
	List<WebElement> multidate;
	
	
	public void  onewayjourney()
	{
		oneway.click();
		System.out.println("one way is selected");
		
	} 
	public void source()
	{
		
		System.out.println("source is selected");
		
		source.sendKeys("ab");
		System.out.println("name is selected");
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
	}
	public void distination(String name)
	{
		dist.click();
		dist.sendKeys(name);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
	}
	public void Dateselect()
	{
	                                
		for(WebElement all : multidate)
		{
		        String alldate         =all.getText();
		        System.out.println(alldate);
		}
		
		
		
		
	}
	
	
	
	
}
