package com.genvideo.backstage.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//*[@id=\"hide\"]/div[2]/div/div/div[1]/img")
	@CacheLookup
	WebElement genVideoLogo;
	
	@FindBy(name = "username")
	@CacheLookup
	WebElement email;
	
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement password;
	
	
	@FindBy(xpath = "//*[@id=\"hide\"]/div[2]/div/div/div[3]/form/div[3]/div[2]/input")
	@CacheLookup
	WebElement button;
	
	@FindBy(name="rememberme")
	@CacheLookup
	WebElement checkbox_Rememberme;
	
	@FindBy(xpath="//*[@id=\"hide\"]/div[2]/div/div/div[5]/a")
	@CacheLookup
	WebElement forgetPassword;
	
	@FindBy(xpath = "//*[@id=\"hide\"]/div[2]/div/div/div[3]/div[5]/a")
	@CacheLookup
	WebElement signout;
	
	public Boolean gen_Video_Logo() {
		
		return genVideoLogo.isDisplayed();
	}
	
	
	public void enterEmail(String userName)
	{
		email.sendKeys(userName);
		
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
		
	}
	
	public void checkboxClick() {
		
		checkbox_Rememberme.click();
	}
	
	
	public void clickLoginButton()
	{
		button.click();
		
	}
	
	public void signOut()
	{
		
		signout.click();
		
	}
	
	public void forgetpasswordlink() {
		 forgetPassword.click();
		
	}
	
	
}
