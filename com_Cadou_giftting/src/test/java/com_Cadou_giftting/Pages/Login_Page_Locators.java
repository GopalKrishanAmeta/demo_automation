package com_Cadou_giftting.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Locators {

WebDriver driver;
	
	public Login_Page_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	

	@FindBy(id="username")
	@CacheLookup
	WebElement email;

	@FindBy(id="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="admin-login-btn-id")
	@CacheLookup
	WebElement submit;

	
	 public void enterEmail(String userName)
	 	{
	 		email.sendKeys(userName);
	 		
	 	}
	 	
	 	public void enterPassword(String pass)
	 	{
	 		password.sendKeys(pass);
	 		
	 	}
	 	
	 	public void click_On_Submit()
	 	{
	 		submit.click();
	 	}
}
