package com.genvideo.TestCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.genvideo.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	ReadConfig readconfig= new ReadConfig();
	public String baseUrl= readconfig.getApplicationURL();
	public String userName= readconfig.getUserName();
	public String pass= readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeSuite 
    static void setupClass(){
		
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver(); 
         
          
          
        //WebDriverManager.firefoxdriver().setup();
        //  driver = new FirefoxDriver();
        
      // WebDriverManager.edgedriver().setup();
      // driver = new EdgeDriver();
		
        driver.manage().window().maximize(); 
        //driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        logger= Logger.getLogger("com.genvideo.backstage");
        
        PropertyConfigurator.configure("log4j.properties");
        
     
         
	}
	
      @AfterSuite  
          public void quitDriver() {  
          driver.quit();  
        }  
}
