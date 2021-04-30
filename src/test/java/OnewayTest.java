import java.io.FileNotFoundException;

import javax.jws.Oneway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Browser;
import com.pages.Onewaypage;

public class OnewayTest   {
   public  WebDriver driver ;
	Onewaypage page = new Onewaypage(driver);
	@BeforeTest
	public void starup() throws FileNotFoundException
	{
		Browser bs = new Browser(driver);
		bs.LanuchBrowser();
		
	}
	
	@Test
	public void onewayj() throws InterruptedException
	{
		Thread.sleep(1000);
		page.onewayjourney();
		Thread.sleep(1000);
		page.source();
		Thread.sleep(1000);
		System.out.println("source staAtion selected");
		
		page.distination("Mumb");
		Thread.sleep(1000);
		System.out.println("distanation staAtion selected");
		
		page.Dateselect();
		
		
	}
	


}