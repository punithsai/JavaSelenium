package com.haltrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.haltrip.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginBtn;	
	
	// intializing the page objects

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	
		
	}
	
public HomePage login(String un,String pw)
{
username.sendKeys(un);
password.sendKeys(pw);
loginBtn.click();

return new HomePage();
	
	
}
}
