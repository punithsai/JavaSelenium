package com.haltrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.haltrip.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[3]/span")
	WebElement contactsLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		System.out.println("home verified cmg");
		return driver.getTitle();
	}
    public ContactsPage ClickOnContactsLink()
    {
    	contactsLink.click();
    	return new ContactsPage();
    }
}
