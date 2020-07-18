package com.test.his.src.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.his.src.base.TestBase;
import com.his.src.util.ExtentReportListener;
import com.main.his.src.Pages.HomePage;
import com.main.his.src.Pages.LoginPage;


@Listeners(ExtentReportListener.class)
public class LoginPageTest extends TestBase{
          
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
    
	@BeforeMethod
	public void setUp() {
		initialization();
		//log.info("browser should be opened");
		selectAdvancedButtonOnManinScreen();
		loginpage=new LoginPage();
	}
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title=loginpage.ValidateLoginPageTitle();
		Assert.assertEquals(title,"HISTree - Login");
	}
	@Test(priority = 2)
	public void hisImageTest() {
		boolean flag=loginpage.ValidateHisImage();
		Assert.assertTrue(flag);
	}
	@Test(priority = 3)
	public void loginTest()  {
		homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		}

}
