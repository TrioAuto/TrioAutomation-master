package com.test.his.src.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.his.src.base.TestBase;
import com.main.his.src.Pages.ERRegistrationPage;
import com.main.his.src.Pages.HomePage;
import com.main.his.src.Pages.LoginPage;

public class ERRegistrationPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ERRegistrationPage erRegistrationPage;
	
	public ERRegistrationPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		selectAdvancedButtonOnManinScreen();
		loginpage=new LoginPage();
		erRegistrationPage=new ERRegistrationPage();
	    homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	     erRegistrationPage= homepage.clickOnErModule();
	     homepage.clickOnMenubar();
	     homepage.clickOnERRegistration("ER Registration");
	}
	@Test(priority = 1)
	public void newERPatientRegistration() throws InterruptedException {
		
		erRegistrationPage.clickOnTitleDropDown("1","Automation", "Testing", "Patient", "Others");
		erRegistrationPage.enterReferredBy("self");
		erRegistrationPage.fillAgeByRadioButton("25","AutoFather","2","Testing address for this patient");
		erRegistrationPage.selectCityDropDown("2857");
		erRegistrationPage.addNewCityBySelectingPlusButton("Test City"+com.his.src.util.TestUtil.getRandomNum(1, 10000), "770");
		erRegistrationPage.clickSaveButtonOnCityPopUP();
		erRegistrationPage.addNewLocalityBySelectingPlusButton("Test local"+com.his.src.util.TestUtil.getRandomNum(1, 10000), "201001");
		erRegistrationPage.selectNationalityFromDropDown("138","123","06/Jul/2020","07/Jul/2040","Police Station");
		//Assert.assertTrue(erRegistrationPage.verifyWithoutSelectingAnyData("Please fill passport detail!"),"Without Selecting Any Details Click Yes Option");
        erRegistrationPage.selectWardTypeFromDropDown("41","Cerious");
	}
	
	     
	     
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
    }

