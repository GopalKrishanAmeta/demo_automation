package com_Cadou_giftting.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com_Cadou_giftting.Utilities.ReadConfig;




import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
 	ReadConfig readconfig= new ReadConfig();
	public String baseUrl= readconfig.getApplicationURL();
	public String userName= readconfig.getUserName();
	public String pass= readconfig.getPassword();
 	
	public static WebDriver driver;
	
	

	@BeforeSuite 
    static void setupClass(){
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 
    	 
          
    //  WebDriverManager.firefoxdriver().setup();
    //   driver = new FirefoxDriver();
        
   //    WebDriverManager.edgedriver().setup();
   //  driver = new EdgeDriver();
		
        driver.manage().window().maximize(); 
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        
     //   logger= Logger.getLogger("com.practies.Project");
     //   PropertyConfigurator.configure("log4j.properties");
      
        
     
         
	}
	
 /*   @AfterSuite  
          public void quitDriver() {  
          driver.quit();  
        }  */
}
