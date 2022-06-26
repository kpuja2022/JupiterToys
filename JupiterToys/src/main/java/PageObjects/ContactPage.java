package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	
	public WebDriver driver;
	
	By contact = By.xpath("//a[@href=\"#/contact\"]");
	By submit = By.xpath("//div[2]//div/a[contains(text(),'Submit')]");
	By firsterrormessage = By.xpath("//*[@id=\"header-message\"]/div");
	By seconderrormessage = By.xpath("//span[@id=\"forename-err\"]");
	By thirderrormessage = By.xpath("//span[@id=\"email-err\"]");
	By fourtherrormessage = By.xpath("//span[@id=\"message-err\"]");
	
	public ContactPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement getContact() 
	{
		return driver.findElement(contact);
	}
	
	public WebElement getsubmit() 
	{
		return driver.findElement(submit);
	}
	
	public WebElement getfirsterrormessage() 
	{
		return driver.findElement(firsterrormessage);
	}
	
	public WebElement getseconderrormessage() 
	{
		return driver.findElement(seconderrormessage);
	}
	
	public WebElement getthirderrormessage() 
	{
		return driver.findElement(thirderrormessage);
	}
	
	public WebElement getfourtherrormessage() 
	{
		return driver.findElement(fourtherrormessage);
	}
}


	
