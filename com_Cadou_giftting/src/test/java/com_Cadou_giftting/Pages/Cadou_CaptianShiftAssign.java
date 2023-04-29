package com_Cadou_giftting.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cadou_CaptianShiftAssign {

WebDriver driver;
	
	public Cadou_CaptianShiftAssign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	

	@FindBy(xpath="//*[@id=\"leftsidebar\"]/div[3]/div/ul/li[4]/a")      
//	@CacheLookup
	WebElement captian_Management;
	
	@FindBy(xpath="//*[@id=\"leftsidebar\"]/div[3]/div/ul/li[4]/ul/li[2]/a")
//	@CacheLookup
	WebElement captian_shifts;
	
	@FindBy(xpath="//*[@id=\"main-container\"]/div[2]/div/div/div[1]/ul/li[2]/a/button")
//	@CacheLookup
	WebElement Assign_Shift;
	
	@FindBy(xpath="//*[@id=\"shift_name\"]")
//	@CacheLookup
	WebElement select_shift;
	
	@FindBy(xpath="//*[@id=\"user_name\"]")
//	@CacheLookup
	WebElement select_caption;
	
	public void click_On_CaptianManagenebt()
 	{
		captian_Management.click();
 	}
	
	public void click_On_CaptianShifts()
 	{
		captian_shifts.click();
 	}
	
	 
	
	public void click_On_AssignShiftButton()
 	{
		Assign_Shift.click();
 	}
	
	public void select_Shift()
 	{
		Select drpownshift = new Select(select_shift);
		drpownshift.selectByIndex(1);
 	}
	
	public void select_Captian()
 	{
		Select drpowncaptian = new Select(select_caption);
		drpowncaptian.selectByIndex(10);
 	}
	
	
	
	
	
	
	
	
	
	
	
}
