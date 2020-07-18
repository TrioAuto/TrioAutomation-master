package com.main.his.src.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.his.src.base.TestBase;

public class LoginPage extends TestBase {
	
	public static final Logger log=Logger.getLogger(LoginPage.class.getName());
       
	@FindBy(xpath="//input[@id='txtLoginName']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
    WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[@class='admin-icon']//img")
	WebElement hislogo;
	
	@FindBy(xpath="//a[@id='btnYesAlreadyLogedinPopup']")
	WebElement session;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageTitle()
	{
		log.info("System should select the login page title");
		return driver.getTitle();
	}
	public boolean ValidateHisImage() {
		return hislogo.isDisplayed();
	}
	public HomePage Login(String un,String pwd) {
		username.sendKeys(un);
		log.info("Enter the username from the drop down: " +un);
		password.sendKeys(pwd);
		log.info("Enter the user password :"+pwd);
		loginbtn.click();
		session.click();
		
		return new HomePage();
	}
}
