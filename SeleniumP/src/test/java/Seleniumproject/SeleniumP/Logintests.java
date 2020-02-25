package Seleniumproject.SeleniumP;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Login;
import Resources.Base;
import Util.TestUtil;

public class Logintests  extends Base{
	
	
	
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	@Test(dataProvider="getLoginData")
	public void LoginTest1(String username,String password)
	{
		Login a=new Login(driver);
		
		a.getUsername().sendKeys(username);
		a.getPassword().sendKeys(password);
		
		a.subButton().click();
		
		
	}
	
	@DataProvider
	public Object[][] getLoginData() throws EncryptedDocumentException, IOException
	{
		Object [][] data=TestUtil.getTestData("Login");	
		
		return data;
			
	}

}
