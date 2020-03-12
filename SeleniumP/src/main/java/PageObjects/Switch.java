package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Switch {
	
	public WebDriver driver;

	public Switch(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	
	By win1=By.xpath("//button[@id='button1']");
	By win2=By.xpath("//button[contains(text(),'New Message Window')]");
	By win3=By.xpath("//button[contains(text(),'New Browser Tab')]");
	
	
	public WebElement getWin()
	{
		return driver.findElement(win1);
	
		
		

	}
	
	
	

}
