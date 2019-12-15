package com.haltrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.haltrip.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[1]/div/input")
	WebElement Check;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a")
	WebElement ContactNewButton;
	
	@FindBy(name="last_name")
	WebElement LastName;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div/div[1]/input")
	WebElement Email;
	
	@FindBy(name="first_name")
	WebElement FirstName;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement SaveBtn;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		System.out.println("home verified cmg");
		return driver.getTitle();
	}
	



	public void CreateNewContact(String Fname,String Lname,String Emailid)
	{

		ContactNewButton.click();
		FirstName.sendKeys(Fname);
		LastName.sendKeys(Lname);
		Email.sendKeys(Emailid);
		SaveBtn.click();
		
		
	}
}
