package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login {
	
	public WebDriver driver;

	public Login(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By username=By.cssSelector("#email");
	By password=By.cssSelector("#pass");
	By submit=By.xpath("//input[@id='u_0_2']");
	By text=By.xpath("//div[@class='_5iyx']");
	By day=By.xpath("//select[@id='day']");
	
	public WebElement getUsername()
	{
		return  driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	
	public WebElement subButton()
	{
		return driver.findElement(submit);
	}
	
	public WebElement getText()
	{
		return driver.findElement(text);
	}
	
	public Select selectDay() throws InterruptedException
	
	{
		
		Thread.sleep(3000);
		
		Select select=new Select(driver.findElement(day));
		return select;
		
		
		
		
		
		
		

		
	}
	
	

}
