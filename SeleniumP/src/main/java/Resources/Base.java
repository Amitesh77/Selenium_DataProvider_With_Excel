package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
	
	
	public static WebDriver driver;
	public Properties prop;
	
	
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\PSK Enterprises\\Documents\\Selenium\\Selenium_DataProvider_With_Excel\\SeleniumP\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PSK Enterprises\\Desktop\\chromedriver\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
		}
		
		return driver;
	}
	
	
	public void getScreenshot(String result) throws IOException
	{
		
		File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src,new File("/Users/568650/Documents/SeleniumP/Screenshots/"+result+"screenshot.png"));
	}
	
	

}
