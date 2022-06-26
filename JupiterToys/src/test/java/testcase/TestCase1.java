package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.ContactInfoPage;
import PageObjects.ContactPage;
import PageObjects.ShopPage;
import base.BaseClass;


public class TestCase1 extends BaseClass {

	@BeforeTest
	public void initialize() throws IOException {
	    driver= initializeDriver();
		driver.get("https://jupiter.cloud.planittesting.com/#/");
}

	@Test
	public void LoginTest() throws IOException, InterruptedException
	{
		ContactPage cp = new ContactPage(driver);
		cp.getContact().click();
		Thread.sleep(3000);
		
		ContactInfoPage cip = new ContactInfoPage(driver);
		cip.getforename().sendKeys("Testingname");
		cip.getemail().sendKeys("test@gmail.com");
		cip.getmessage().sendKeys("testmessage");
		Thread.sleep(3000);
		cip.getsubmit().click();
		System.out.println("Submission is Successful");
		Thread.sleep(10000);
		ShopPage sp = new ShopPage(driver);
		sp.getshop().click();
		Thread.sleep(3000);
		sp.getstuffedfrog().click();
		sp.getstuffedfrog().click();
		
		sp.getfluffybunny().click();
		sp.getfluffybunny().click();
		sp.getfluffybunny().click();
		sp.getfluffybunny().click();
		sp.getfluffybunny().click();
		
		sp.getvalentinebear().click();
		sp.getvalentinebear().click();
		sp.getvalentinebear().click();
		
		sp.getcart().click();
		 
		Thread.sleep(3000);
		 Assert.assertEquals(sp.getfrogsubtotal().getText(),"$21.98");
		 System.out.println("FROGSUBTOTALPRICE is Verified");
		 
		 Assert.assertEquals(sp.getbunnysubtotal().getText(),"$49.95");
		 System.out.println("BUNNYSUBTOTALPRICE is Verified");
		 
		 Assert.assertEquals(sp.getbearsubtotal().getText(),"$44.97");
		 System.out.println("BEARSUBTOTALPRICE is Verified");
		    
		    Thread.sleep(3000);
		    
		    Assert.assertEquals(sp.getfrogactualprice().getText(),"$10.99");
		    System.out.println("FROGACTUALPRICE is Verified");
		    
		    Assert.assertEquals(sp.getbunnyactualprice().getText(),"$9.99");
		    System.out.println("BUNNYGACTUALPRICE is Verified");
		    
		    Assert.assertEquals(sp.getbearactualprice().getText(),"$14.99");
		    System.out.println("BEARACTUALPRICE is Verified");
		}
	@AfterTest
	 public void teardown() {
		driver.close();
	}
		}
