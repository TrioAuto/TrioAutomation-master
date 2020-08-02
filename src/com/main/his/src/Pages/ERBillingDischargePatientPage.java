package com.main.his.src.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.his.src.base.TestBase;


public class ERBillingDischargePatientPage extends TestBase
{
	

	@FindBy(xpath="//input[@id='ER_Number']")
	WebElement ERBILLING_ERNO_TEXT_BOX;
	@FindBy(xpath="//a[@id='BillDetailsModelClose']")
	WebElement ERBILLING_BILL_DETAIL_CLOSE_POP_UP;
	@FindBy(xpath="//input[@id='rb_Summary_Bill']")
	WebElement ERBILLING_INTRIMBILL_SUMMARY_RADIO_BUTTON;
	@FindBy(xpath="//a[@id='btnInterimBill']")
	WebElement ERBILLING_INTRIMBILL_YES_OPTION;
	@FindBy(xpath="//input[@id='rb_Detailed_Bill']")
	WebElement ERBILLING_INTRIMBILL_DETAILS_RADIO_BUTTON;
	@FindBy(xpath="//a[@id='btnInterimBill_close']")
	WebElement ERBILLING_INTRIMBILL_NO_OPTION;
	@FindBy(xpath="//textarea[@id='txt_Remarks']")
	WebElement ERBILLING_DISCHARG_REMARKS;
	@FindBy(xpath="//a[@id='DischargeMSG_Modal']")
	WebElement ERBILLING_DISCHARGE_OK_BUTTON;
	@FindBy(xpath="//a[@id='btnDischargeThePatient_Yes']")
	WebElement ERBILLING_DISCHARGE_YES_OPTION;
	@FindBy(xpath="//a[@id='tabcash']")
    WebElement ERBILLING_BILL_SETTLEMENT_CASH_TAB;
	@FindBy(xpath="//input[@id='txtCSAmount']")
	WebElement ERBILLING_BILLSETTLEMENT_CASH_TEXT_BOX;
	@FindBy(xpath="//a[@id='tabCheque']")
	WebElement ERBILLING_BILLSETTLEMENT_CHEQUE_TAB;
	@FindBy(xpath="//input[@id='TXTChequeNo']")
	WebElement ERBILLING_BILLSETTLEMENT_CHEQUE_NO_TEXT_BOX;
	@FindBy(xpath="//select[@id='cmbchequeBank']")
	WebElement ERBILLING_BILLSETTLEMENT_CHEQUE_BANK_DROP_DOWN;
	@FindBy(xpath="//input[@id='txtCqBranchName']")
	WebElement ERBILLING_BILLSETTLEMENT_CHEQUE_BRANCH_TEXT_BOX;
	@FindBy(xpath="//input[@id='txtCQAmount']")
	WebElement ERBILLING_BILLSETTLEMENT_CHEQUE_AMOUNT_TEXT_BOX;
	@FindBy(xpath="//select[@id='cmbcheque']")
	WebElement ERBILLING_BILLSETTLEMENT_CHEQUE_AUTHORISED_DROP_DOWN;
	@FindBy(xpath="//a[@id='tabDue']")
	WebElement ERBILLING_BILLSETTLEMENT_DUE_TAB;
	@FindBy(xpath="//select[@id='cmbdue']")
	WebElement ERBILLING_BILLSETTLEMENT_DUE_AUTHORISED_DROP_DOWN;
	@FindBy(xpath="//textarea[@id='txtDueRemarks']")
	WebElement ERBILLING_BILLSETTLEMENT_DUE_REMARKS_TEXT_BOX;
	@FindBy(xpath="//i[@class='fa fa-usd']")
	WebElement ERBILLING_BILLSETTLEMENT_BILL_BUTTON;
	@FindBy(xpath="//a[@id='ERBillingFinalSettlementPopupforMessageOK']")
	WebElement ERBILLING_BILLSETTLEMENT_BILL_YES_OPTION;
	@FindBy(xpath="//div[@id='ERBillingPopupforMessage']//a[@id='PopupOK']")
	WebElement ERBILLING_BILLSETTLEMENT_OK_OPTION;
	
	public ERBillingDischargePatientPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterERNoAndOtherDetails(String erno) {
		try {
			ERBILLING_ERNO_TEXT_BOX.sendKeys(erno);
			ERBILLING_ERNO_TEXT_BOX.sendKeys(Keys.ENTER);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void closeBillDetailsPopUP() throws InterruptedException {
		Thread.sleep(4000);
		ERBILLING_BILL_DETAIL_CLOSE_POP_UP.click();
		
	}

	public void intrimBillButtonSelection() throws InterruptedException {
		try {
			ERBILLING_INTRIMBILL_SUMMARY_RADIO_BUTTON.click();
			ERBILLING_INTRIMBILL_YES_OPTION.click();
			TestBase.clickOnPrintAndHandleAnotherPopUpWindow();
			ERBILLING_INTRIMBILL_DETAILS_RADIO_BUTTON.click();
			ERBILLING_INTRIMBILL_YES_OPTION.click();
			TestBase.clickOnPrintAndHandleAnotherPopUpWindow();
			ERBILLING_INTRIMBILL_NO_OPTION.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void dischargeNuttonSelection(String remarks) {
		try {
		ERBILLING_DISCHARG_REMARKS.sendKeys(remarks);
		ERBILLING_DISCHARGE_OK_BUTTON.click();
		ERBILLING_DISCHARGE_YES_OPTION.click();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void billSettlementSelection(String cash) {
		try {
			ERBILLING_BILL_SETTLEMENT_CASH_TAB.click();
			ERBILLING_BILLSETTLEMENT_CASH_TEXT_BOX.clear();
			ERBILLING_BILLSETTLEMENT_CASH_TEXT_BOX.sendKeys(cash);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void billSettlementChequeSelection(String cheque,
			String bank,String branch,String amount,String autho) {
		try {
			ERBILLING_BILLSETTLEMENT_CHEQUE_NO_TEXT_BOX.sendKeys(cheque);
		    Select select=new Select(ERBILLING_BILLSETTLEMENT_CHEQUE_BANK_DROP_DOWN);
		    select.selectByVisibleText(bank);
		    ERBILLING_BILLSETTLEMENT_CHEQUE_BRANCH_TEXT_BOX.sendKeys(branch);
		    ERBILLING_BILLSETTLEMENT_CHEQUE_AMOUNT_TEXT_BOX.clear();
		    ERBILLING_BILLSETTLEMENT_CHEQUE_AMOUNT_TEXT_BOX.sendKeys(amount);
		    Select select1=new Select(ERBILLING_BILLSETTLEMENT_CHEQUE_AUTHORISED_DROP_DOWN);
		    select1.selectByVisibleText(autho);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void billSetllementDueSelection(String autho,String remarks) {
		try {
			ERBILLING_BILLSETTLEMENT_DUE_TAB.click();
			Select select=new Select(ERBILLING_BILLSETTLEMENT_DUE_AUTHORISED_DROP_DOWN);
			select.selectByVisibleText(autho);
			ERBILLING_BILLSETTLEMENT_DUE_REMARKS_TEXT_BOX.sendKeys(remarks);
			ERBILLING_BILLSETTLEMENT_BILL_BUTTON.click();
			ERBILLING_BILLSETTLEMENT_BILL_YES_OPTION.click();
			ERBILLING_BILLSETTLEMENT_OK_OPTION.click();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}     
