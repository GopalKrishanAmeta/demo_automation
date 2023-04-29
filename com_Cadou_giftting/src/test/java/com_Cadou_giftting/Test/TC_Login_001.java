package com_Cadou_giftting.Test;



import org.testng.Assert;
import org.testng.annotations.Test;

import com_Cadou_giftting.Pages.Cadou_CaptianShiftAssign;
import com_Cadou_giftting.Pages.Login_Page_Locators;

public class TC_Login_001 extends BaseClass {
	
@Test(priority = 1)
	
	public void verifyTitle() {
		
		driver.get(baseUrl);
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle= "Cadou";
	
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}

@Test(priority = 2)

public void verifyLogin(){
	
	Login_Page_Locators lp = new Login_Page_Locators(driver);
	
	lp.enterEmail(userName);
	lp.enterPassword(pass);
	lp.click_On_Submit();
}

@Test(priority = 3)
public void AssignCaptianShift(){
	
	Cadou_CaptianShiftAssign cp = new Cadou_CaptianShiftAssign(driver);
	
	cp.click_On_CaptianManagenebt();
	// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	cp.click_On_CaptianShifts();
	
	cp.click_On_AssignShiftButton();
	
	driver.switchTo().activeElement();
	
	cp.select_Shift();
	cp.select_Captian();
}

	
	

}
