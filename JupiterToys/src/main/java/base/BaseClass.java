package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException 
	
	{
		Properties prop=new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\C5334825\\eclipse-workspace\\JupiterToys\\src\\test\\resources\\configfiles\\config.properties");	
        prop.load(ip);
        String browserName = prop.getProperty("browser");
         	
        if(browserName.equals("chrome")) 
        {
        	System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
        	driver=new ChromeDriver();
        }
        else if(browserName.equals("FireFox")) {
    		System.setProperty("webdriver.gecko.driver","C:\\browserdrivers\\geckodriver.exe");
            driver=new FirefoxDriver();

        	
        }
   return driver;
	}
}
