package Seleniumproject.SeleniumP;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Login;
import Resources.Base;

public class GetText extends Base{
	
	
	@BeforeTest
	public void driverinitialization() throws IOException
	{
		driver=initializeDriver();
	}
	
	
	@Test
	public void getFbtext()
	{
		driver.get(prop.getProperty("url"));
		
		Login tx=new Login(driver);
		
		String text=tx.getText().getText();
		
		System.out.println("The text is :"+text);
		
		
	}
	
	
	

}
