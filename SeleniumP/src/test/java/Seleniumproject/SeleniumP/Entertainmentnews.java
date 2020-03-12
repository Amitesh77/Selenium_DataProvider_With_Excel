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
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
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
		driver.manage().timeouts().implicitlyWait(200000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url2"));
		Thread.sleep(5000);
		
	}
	
	
	
	
	

	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Test
	public void getAllCities() throws InterruptedException
	{
		GetCity gc=new GetCity(driver);
		
		List<WebElement> cities=gc.getCity();
		
	for(int i=0;i<cities.size();i++)
	{
		String[] citi=cities.get(i).getAttribute("href").split("city/");
		
		String cityname=citi[1];
		if(cityname.equals("bangalore"))
		{
			Thread.sleep(3000);
			cities.get(i).click();
		}
			
		}
	}
	


}
