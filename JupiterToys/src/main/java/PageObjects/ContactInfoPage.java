package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactInfoPage {
public WebDriver driver;
	
	By forename = By.xpath("//*[@id=\"forename\"]");
	By email = By.xpath("//*[@id=\"email\"]");
	By message = By.xpath("//*[@id=\"message\"]");
	By submit = By.xpath("//div[2]//div/a[contains(text(),'Submit')]");
	
	public ContactInfoPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getforename() 
	{
		return driver.findElement(forename);
	}

	public WebElement getemail() 
	{
		return driver.findElement(email);
	}
	
	public WebElement getmessage() 
	{
		return driver.findElement(message);
	}
	
	public WebElement getsubmit() 
	{
		return driver.findElement(submit);
	}
}


