package com.haltrip.qa.testcases;

import org.testng.annotations.Test;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.haltrip.qa.base.TestBase;
import com.haltrip.qa.pages.ContactsPage;
import com.haltrip.qa.pages.HomePage;
import com.haltrip.qa.pages.LoginPage;
import com.haltrip.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	
	String sheetName="Sheet1";
	public ContactsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspage=homepage.ClickOnContactsLink();
	}
	
	
	@DataProvider
	public Object[][] getCRMTestData()
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		
		return data;
	}
	
	@Test(dataProvider="getCRMTestData")
	public void ValidateCreateNewContact(String fname,String lname,String Email)
	{
		
	//	contactspage.hello();
	 contactspage.CreateNewContact(fname,lname,Email);	
	}
	
	

	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}
	
	
}
