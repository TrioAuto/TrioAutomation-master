package com.test.his.src.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.his.src.base.TestBase;
import com.main.his.src.Pages.ERBillingDischargePatientPage;
import com.main.his.src.Pages.ERRegistrationPage;
import com.main.his.src.Pages.HomePage;
import com.main.his.src.Pages.LoginPage;

public class ERBillingDischargePatientTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ERRegistrationPage erRegistrationPage;
	ERBillingDischargePatientPage erDischargepatient;
	
	public ERBillingDischargePatientTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		selectAdvancedButtonOnManinScreen();
		loginpage=new LoginPage();
		erRegistrationPage=new ERRegistrationPage();
		 homepage= new HomePage();
	    homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	   
	    erRegistrationPage=homepage.clickOnErModule();
	     erDischargepatient=new ERBillingDischargePatientPage();
	     homepage.clickOnERBillingDrpDwn();
	     homepage.clickOnERBillingDropDown("ER Billing");

	}
   @Test
   public void enterERNoAndClickSomeDetails() throws InterruptedException {
	   erDischargepatient.enterERNoAndOtherDetails(prop.getProperty("ERNo"));
	   homepage.clickOnERBillingLeftButtons("BillDetails");
	   erDischargepatient.closeBillDetailsPopUP();
	   homepage.clickOnERBillingLeftButtons("PendingInvestigation");
	   homepage.clickOnERBillingLeftButtons("InterimBill");
	   erDischargepatient.intrimBillButtonSelection();
	   homepage.clickOnERBillingLeftButtons("Discharge");
	   erDischargepatient.dischargeNuttonSelection("Testing Remarks");
	   homepage.clickOnERBillingLeftButtons("BillSettlement");
	   erDischargepatient.billSettlementSelection("10");
	   erDischargepatient.billSettlementChequeSelection("12324234234234",
			   "Bank of Nova Scotias","Nova","20","Management Decision");
	   erDischargepatient.billSetllementDueSelection("Management Decision","Due remarks");
	   
	   
	   
	   
   }
}
