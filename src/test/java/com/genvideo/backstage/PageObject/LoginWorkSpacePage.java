package com.genvideo.backstage.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginWorkSpacePage {

	 WebDriver driver;
		
		public LoginWorkSpacePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			}
		
		@FindBy(xpath="//*[@id=\"hide\"]/div[2]/div/div/div[1]/img")
		@CacheLookup
		WebElement verify_Logo;
		

		@FindBy(xpath="//*[@id=\"hide\"]/div[2]/div/div/div[3]/div[1]/select")   
		@CacheLookup
		WebElement choose_Conglomerate;  
		
		
		@FindBy(xpath= "//*[@id=\"hide\"]/div[2]/div/div/div[3]/div[2]/select")
		@CacheLookup
		WebElement Brand;
		
		
		@FindBy(xpath="//*[@id=\"hide\"]/div[2]/div/div/div[3]/div[3]/select")
		@CacheLookup
		WebElement Group;
		
		
		@FindBy(xpath="//*[@id=\"hide\"]/div[2]/div/div/div[3]/div[4]/a")
		@CacheLookup
		WebElement GoButton;
		
		
		@FindBy(xpath="/html/body/div/div/main/div/header/a")
		@CacheLookup
		WebElement congloromate;
		
		
		@FindBy(xpath = "//*[@id=\"hide\"]/div[2]/div/div/div[3]/div[5]/a")
		@CacheLookup
		WebElement signout;
		
		
		public Boolean workSpacePage_Logo() {
			
			return verify_Logo.isDisplayed();
		}
		
		public void choose_a_Conglomerate()
		{
			
		   Select swp= new Select(choose_Conglomerate);
		   swp.selectByVisibleText("EXPO");
		
	     }
		
		public void choose_a_Brand()
		{
			
		
			Select swp= new Select(Brand);
			
			swp.selectByVisibleText("Demo");
		
	     }
		
		public void choose_a_Group()
		{
			
		
			Select swp= new Select(Group);
			
			swp.selectByVisibleText("Admin");
		
	     }
		
		public void clickGo()
		{
			
			GoButton.click();
		
	     }
		
		public void conglomerate()
		{
			
			congloromate.click();
		
	     }
		
		public void signOut()
		{
			
			signout.click();
			
		}
	}

