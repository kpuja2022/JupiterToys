package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.ContactPage;
import base.BaseClass;

public class VerificationTestCase2 extends BaseClass {
	
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
		cp.getsubmit().click();
		
		Assert.assertEquals(cp.getfirsterrormessage().getText(),"We welcome your feedback - but we won't get it unless you complete the form correctly.");
	    System.out.println("FirstErrormessage is Verified");
	    
	    Assert.assertEquals(cp.getseconderrormessage().getText(),"Forename is required");
	    System.out.println("SecondErrormessage is Verified");
	    
	    Assert.assertEquals(cp.getthirderrormessage().getText(),"Email is required");
	    System.out.println("SecondErrormessage is Verified");
	    
	    Assert.assertEquals(cp.getfourtherrormessage().getText(),"Message is required");
	    System.out.println("SecondErrormessage is Verified");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}

