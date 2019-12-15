package com.haltrip.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.haltrip.qa.base.TestBase;
import com.haltrip.qa.pages.HomePage;
import com.haltrip.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage= new LoginPage();
		
	}
	
	@Test
	public void loginTest()
	{
		homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}
	

}
