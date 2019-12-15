package com.haltrip.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.haltrip.qa.base.TestBase;
import com.haltrip.qa.pages.ContactsPage;
import com.haltrip.qa.pages.HomePage;
import com.haltrip.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));		
		
	}

	@Test(priority=1)
	public void verifyHomePageTitle()
	{
		
		String homePageTitle=homepage.verifyHomePageTitle();
		
		Assert.assertEquals(homePageTitle, "Cogmento CRM","Home title not matched");
	}
	
	@Test(priority=2)
	public void  clickonContactsPage()
	{
	   homepage.ClickOnContactsLink();
        	
		
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}
	
}
