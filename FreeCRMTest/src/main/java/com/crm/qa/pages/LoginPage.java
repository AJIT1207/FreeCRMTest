package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//pagefactory
	//@FindBy(name="username")
	@FindBy(name="userName")
	WebElement username;
	
	//@FindBy(name="password")
	@FindBy(name="password")
	WebElement password;
	
	//@FindBy(xpath="//input[@value='Login']")
	@FindBy(name="submit")
	WebElement loginBtn;
	
	//@FindBy(xpath="//a[normalize-space()='Sign Up']")
	@FindBy(xpath="//a[normalize-space()='Sign Up']")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	public void LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		    	//js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}

}
