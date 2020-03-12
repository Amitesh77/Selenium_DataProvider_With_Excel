package Seleniumproject.SeleniumP;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Login;
import Resources.Base;

public class Logintest extends Base{
	
public Login t1;;
	
	@BeforeTest
	public void driverInit() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		 t1=new Login(driver);
	}
	
	@Test(enabled=false)
	public void LoginPage()
	{
		
		
		
		t1.getUsername().sendKeys("amiteshsharma77@gmail.com");
		t1.getPassword().sendKeys("whferohcv");
		
		t1.subButton().click();

	}
	
	@Test
	public void getDropdowns() throws InterruptedException
	{
		Select select=t1.selectDay();
		
		select.selectByVisibleText("20");
		
		
		
	
	}
	

}
