package PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetCity {
	
	
	public WebDriver driver;

	public GetCity(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By cityhover=By.xpath("//a[text()='City'][1]");
	
	
	By allcities=By.xpath("//div[@class='dropdown multi-list']//a");
	
	
	
	
	
	
	
	
	
	
	
	
	public List<WebElement> getCity()
	{
		Actions action=new Actions(driver);
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
	
		action.moveToElement(driver.findElement(cityhover));
		
		List<WebElement> element2=driver.findElements(allcities);
		
		return element2;
		
	
	}
	
	
	
	

}
