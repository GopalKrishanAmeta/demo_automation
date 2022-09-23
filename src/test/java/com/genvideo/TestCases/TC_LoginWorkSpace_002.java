package com.genvideo.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.genvideo.backstage.PageObject.LoginPage;
import com.genvideo.backstage.PageObject.LoginWorkSpacePage;

public class TC_LoginWorkSpace_002 extends BaseClass{

    @Test(priority = 1)
	public void verifyLoginWorkSpaceTitle(){
		
		
		logger.info("Open url"); 
		driver.get(baseUrl);
		
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
     
       
 }	
    @Test(priority = 2)
	
	public void verify_Logo_on_WorkSpacePage() throws InterruptedException {
		
    	LoginWorkSpacePage workspace= new LoginWorkSpacePage(driver);
        Thread.sleep(1000);
        Boolean logo = workspace.workSpacePage_Logo();
        Assert.assertTrue(logo);
        Thread.sleep(1000);
        
	}
    
    @Test(priority = 3)
    
    public void selectWorkSpace() throws InterruptedException {
        
        LoginWorkSpacePage workspace= new LoginWorkSpacePage(driver);
        
        workspace.choose_a_Conglomerate();
        workspace.choose_a_Brand();
        workspace.choose_a_Group();
        workspace.clickGo();
        
        Thread.sleep(4000);
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Demo:Campaigns";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        
        Thread.sleep(3000);
        workspace.conglomerate();
        
        workspace.signOut();   
        	
    }
    
}
