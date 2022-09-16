package com.amazon.qa.testpages;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.baseclass.BaseClass;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;

	public LoginTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initilization();
		loginpage = new LoginPage();	
	}
	
	@Test
	public void loginfunction_test() throws IOException
	{
		homepage =  loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}

}
