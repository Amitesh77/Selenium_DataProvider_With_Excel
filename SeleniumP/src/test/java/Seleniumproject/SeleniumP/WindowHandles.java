package Seleniumproject.SeleniumP;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Switch;
import Resources.Base;

public class WindowHandles extends Base{
	
	
	@BeforeMethod
	public void startUp() throws IOException
	{
		driver=initializeDriver();
		
		driver.get(prop.getProperty("url1"));
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Test
	public void swithWindows()
	{
		
		Switch sw=new Switch(driver);
		
		WebElement ele=sw.getWin();
		ele.click();
		
		Set<String> handles= driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		while(it.hasNext())
		{
			String parent=it.next();
			
			System.out.println("The parent title is :"+driver.getTitle());
			
			String child=it.next();
			
			driver.switchTo().window(child);
			
			System.out.println("The child title is  :"+driver.getTitle());
			
			driver.switchTo().defaultContent();
			
			System.out.println("Again parent title  :"+driver.getTitle());
		}
		
	}

}
