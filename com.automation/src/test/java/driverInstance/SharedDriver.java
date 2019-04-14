package driverInstance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedDriver {

	public static  WebDriver driver;

    
     public void setUp() throws Exception 
     {
        System.setProperty("webdriver.chrome.driver","./chromedriver//chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
     }
     
     public void tearDown() throws Exception 
     {
        driver.quit();
        System.out.println("Browser Closed");
   }
	
}
