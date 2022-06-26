package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage{
	
	public WebDriver driver;
	
	By shop = By.xpath("//*[@id=\"nav-shop\"]/a");
	By stuffedfrog = By.xpath("//*[@id=\"product-2\"]/div/p/a");
	By fluffybunny = By.xpath("//*[@id=\"product-4\"]/div/p/a[contains(text(),'Buy')]");
	By valentinebear = By.xpath("//*[@id=\"product-7\"]/div/p/a[contains(text(),'Buy')]");	
	By cart = By.xpath("//*[@id=\"nav-cart\"]/a[contains(text(),'Cart')]");
	By frogsubtotal = By.xpath("//td[contains(text(),'$21.98')]");
	By bunnysubtotal = By.xpath("//td[contains(text(),'$49.95')]");
	By bearsubtotal = By.xpath("//td[contains(text(),'$44.97')]");
	By frogactualprice = By.xpath("//td[contains(text(),'$10.99')]");
	By bunnyactualprice = By.xpath("//td[contains(text(),'$9.99')]");
	By bearactualprice = By.xpath("//td[contains(text(),'$14.99')]");
	
	public ShopPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public WebElement getshop() 
	{
		return driver.findElement(shop);
	}
	
	public WebElement getstuffedfrog() 
	{
		return driver.findElement(stuffedfrog);
	}
	
	public WebElement getfluffybunny() 
	{
		return driver.findElement(fluffybunny);
	}
	
	public WebElement getvalentinebear() 
	{
		return driver.findElement(valentinebear);
	}
	
	public WebElement getcart() 
	{
		return driver.findElement(cart);
	}
	
	public WebElement getfrogsubtotal() 
	{
		return driver.findElement(frogsubtotal);
	}
	
	public WebElement getbunnysubtotal() 
	{
		return driver.findElement(bunnysubtotal);
	}
	
	public WebElement getbearsubtotal() 
	{
		return driver.findElement(bearsubtotal);
	}
	
	public WebElement getfrogactualprice() 
	{
		return driver.findElement(frogactualprice);
	}
	
	public WebElement getbunnyactualprice() 
	{
		return driver.findElement(bunnyactualprice);
	}
	
	public WebElement getbearactualprice() 
	{
		return driver.findElement(bearactualprice);
	}
	
	

}
