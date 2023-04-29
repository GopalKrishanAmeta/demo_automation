package com.genvideo.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.genvideo.backstage.PageObject.LoginPage;

public class TC_Login_001 extends BaseClass {
	
	@Test(priority = 1)
	
	public void verifyTitle() {
		logger.info("Open url");
		driver.get(baseUrl);
		logger.info("Get login page url");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle= "Login gen.video";
		logger.info("Verifiy the URL");
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}
	
	@Test(priority = 2)
	
	public void verifyLogo() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(1000);
		Boolean logo= lp.gen_Video_Logo();
		Assert.assertTrue(logo);
	}
	
	
    @Test(priority = 3)
	public void verifyLogin(){
		
        LoginPage lp=new LoginPage(driver);
        logger.info("user name entered");
        lp.enterEmail(userName);
        logger.info("Enter password");
        lp.enterPassword(pass);
        logger.info("Click checkbox rememberme");
        lp.checkboxClick();
        logger.info("Click button");
        lp.clickLoginButton();
        
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Login Workspace gen.video";
        Assert.assertEquals(expectedTitle, actualTitle);
        lp.signOut(); 
      
}	
    @Test(priority = 4)
    
    public void verifyForgetPasswordLink() {
    	
		 LoginPage lp=new LoginPage(driver);
		 lp.forgetpasswordlink();
		 
		 String actualTitle=driver.getTitle();
		 System.out.println(actualTitle);
		 String expectedTitle= "Login :: gen.video";
		 
		 Assert.assertEquals(expectedTitle, actualTitle);
		 
    }
    
    
}
