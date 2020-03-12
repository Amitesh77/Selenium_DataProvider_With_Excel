package Seleniumproject.SeleniumP;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.GetCity;
import PageObjects.Login;
import Resources.Base;
import Util.TestUtil;

public class Entertainmentnews  extends Base{
	
	
	
	
	
	
	

	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url2"));
		Thread.sleep(5000);
		
	}
	
	
	
	
	

	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Test
	public void getAllCities()
	{
		GetCity gc=new GetCity(driver);
		
		List<WebElement> cities=gc.getCity();
		
		for (WebElement c : cities) {
			
			System.out.println(c);
			
		}
	}
	


}
