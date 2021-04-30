  import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.Browser;
import com.pages.Onewaypage;

public class Ofirest extends Onewaypage {

	
	

	public Ofirest(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver ;
	Browser bs = new Browser();
	//Browser bs = PageFactory.initElements(driver,Browser.class);
	//Onewaypage ps =PageFactory.initElements(driver,Onewaypage.class);
	
	@Test
	public void selectoneway() throws IOException, InterruptedException 
	{
		
		bs.LanuchBrowser();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']")).click();
		System.out.println("sname");
		/*String sname = pro.getProperty("sourcename");
		System.out.println(sname);
		//ps.source(pro.getProperty("sourcename"));
		
		ps.source();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ps.distination(pro.getProperty("Distanation"));
	    System.out.println("source station name selected ");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
	    
	    
		
		
		
		
		
	}
	
	
	
	
}
