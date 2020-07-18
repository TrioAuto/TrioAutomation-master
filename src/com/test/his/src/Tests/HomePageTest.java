package com.test.his.src.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.his.src.base.TestBase;
import com.main.his.src.Pages.ERRegistrationPage;
import com.main.his.src.Pages.HomePage;
import com.main.his.src.Pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ERRegistrationPage erRegistrationPage;
      
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		selectAdvancedButtonOnManinScreen();
		loginpage=new LoginPage();
		erRegistrationPage=new ERRegistrationPage();
	 homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void verifyHomePageTitle() {
		String homePageTitle=homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,"HISTree - Launchpad","Home page title not matched");
	}
	@Test
	public void verifyERModule() throws InterruptedException {
		erRegistrationPage=homepage.clickOnErModule();
		Thread.sleep(4000);
	}
	@AfterMethod 
	public void teardown() {
		driver.quit();
	}

}
