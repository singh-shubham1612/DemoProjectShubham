package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.baseclass.BaseClass;

public class LoginPage extends BaseClass
{
	
   // Initializing the Page object
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);   // How to initialize pagefactory- using initelemnet method  
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="gw-sign-in-button")
	WebElement sign_in_securly;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(id="continue")
	WebElement Continue_button;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement Submit_button;
	
	
	public HomePage login(String em, String pass) throws IOException
	{
		sign_in_securly.click();
		Email.sendKeys(em);
		Continue_button.click();
		Password.sendKeys(pass);
		Submit_button.click();
		return new HomePage();
		
	}
	
	
	
	
	
	
	

	
	

}
