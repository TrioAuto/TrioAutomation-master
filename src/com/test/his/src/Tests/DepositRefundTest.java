package com.test.his.src.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.his.src.base.TestBase;
import com.main.his.src.Pages.DepositAndRefundPage;
import com.main.his.src.Pages.ERRegistrationPage;
import com.main.his.src.Pages.HomePage;
import com.main.his.src.Pages.LoginPage;

public class DepositRefundTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	ERRegistrationPage erRegistrationPage;
	DepositAndRefundPage depositrefund;
	
	public DepositRefundTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		selectAdvancedButtonOnManinScreen();
		loginpage=new LoginPage();
		erRegistrationPage=new ERRegistrationPage();
		depositrefund=new DepositAndRefundPage();
	    homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	     erRegistrationPage= homepage.clickOnErModule();
	     
	}
	@Test
	public void depositAndRefund() {
		depositrefund.enterERNoInTextBox(prop.getProperty("REFUNDER"));
		depositrefund.enterAmountInCashtMOP("1000");
		depositrefund.depositAmountByChequeMOP("123456789","28-Jul-2030",
				"Bank of Baroda","Noida","2000");
		depositrefund.depositAmountByCreditMOP("11242342343443434","mastercard",
				"ANZ Grindlays Bank","11111111123","3000");
		depositrefund.depositAmountByDebitMOP("3462374623834",
				"RuPay","Axis Bank","4234234354545","4000");
		depositrefund.depositAmountByNEFTMOP("213527472374435",
				"01-Jul-2020","Bank of Punjab Limited","punjab","5000");
		depositrefund.depositAmountByOtherMOP("Mobikwik","34234234234234","6000");
		depositrefund.refundButtonSelection();
		
		}
	@Test
	public void depositRefundAmount() throws InterruptedException {
		depositrefund.enterERNoInTextBox(prop.getProperty("REFUNDER"));
		depositrefund.refundButtonSelection();
		depositrefund.refundOfDepositAmountByCash("10");
		depositrefund.refundOfDepositAmountByCredit("24234234234234",
				"American Express Bank","Noida","20");
		
	}
}
