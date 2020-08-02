package com.test.his.src.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.his.src.base.TestBase;
import com.main.his.src.Pages.ERRegistrationPage;
import com.main.his.src.Pages.HomePage;
import com.main.his.src.Pages.LoginPage;

public class UpdateERRegisteredPatientDetailsTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ERRegistrationPage erRegistrationPage;
	
	 public UpdateERRegisteredPatientDetailsTest() {
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
	@Test
	public void updatePatientDeatils() {
		erRegistrationPage.enterRegisteredPatientERNo(prop.getProperty("ERNo"));
		erRegistrationPage.modifyPateintDetails("UpdatedFirstName", "UpdatedLastName", "This is modify reason");
		erRegistrationPage.selectRequestedbedtype("Single");
		//erRegistrationPage.selectBillableBedType("Single");
		erRegistrationPage.selectAllotedBedType();
		erRegistrationPage.fillNextOfKinDetails("KinTesting", "EmergencyTesting", "12345678910", "Automation","Testing");
		erRegistrationPage.selectSaveButton();
	}
}
