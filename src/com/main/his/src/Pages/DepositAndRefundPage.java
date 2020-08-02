package com.main.his.src.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.his.src.base.TestBase;

public class DepositAndRefundPage extends TestBase {

	@FindBy(xpath="//a[contains(text(),'Deposit')]")
	WebElement DEPOSIT_REFUNDS_TAB;
	@FindBy(xpath="//input[@id='ErNo1']")
	WebElement ER_NO_TEXT_BOX2;
	@FindBy(xpath="//input[@id='Amount']")
	WebElement AMOUNT_TEXT_BOX;
	@FindBy(xpath="//a[@id='Deposit']//i")
	WebElement DEPOSIT_BUTTON;
	@FindBy(xpath="//a[@id='btnDepConfirmYes']")
	WebElement CONFIRM_DEPOSIT_YES_OPTION;
	@FindBy(xpath="//input[@id='Cheque_']")
	WebElement CHEQUE_RADIO_BUTTON;
	@FindBy(xpath="//input[@id='cheque_no']")
	WebElement CHEQUE_NO_TEXT_BOX;
	@FindBy(xpath="//input[@id='Issue_name']")
	WebElement CHEQUE_ISSUE_DATE;
	@FindBy(xpath="//select[@id='Bank_Name_cheque']")
	WebElement CHEQUE_BANK_DROP_DOWN;
	@FindBy(xpath="//input[@id='Brach_Number']")
	WebElement CHEQUE_BRANCH_NAME;
	@FindBy(xpath="//input[@id='AmtCheuqDpt']")
	WebElement CHEQUE_AMOUNT_TEXT_BOX;
	@FindBy(xpath="//input[@id='Credit_']")
	WebElement CREDIT_CARD_RADIO_BUTTON;
	@FindBy(xpath="//input[@id='Card_no']")
	WebElement CREDIT_CARD_NO_TEXT_BOX;
	@FindBy(xpath="//select[@id='Crd_name']")
	WebElement CREDIT_CARD_NAME_DROP_DOWN;
	@FindBy(xpath="//select[@id='Bank_Name']")
	WebElement CREDIT_BANK_NAME_DROP_DOWN;
	@FindBy(xpath="//input[@id='B_Number']")
	WebElement CREDIT_TRANS_NO_TEXT_BOX;
	@FindBy(xpath="//input[@id='C_Amt']")
	WebElement CREDIT_AMOUNT_TEXT_BOX;
	@FindBy(xpath="//input[@id='Debit_']")
	WebElement DEBIT_RADIO_BUTTON_SELECTION;
	@FindBy(xpath="//input[@id='D_Card_no']")
	WebElement DEBIT_CARD_NO_TEXT_BOX;
	@FindBy(xpath="//select[@id='D_Crd_name']")
	WebElement DEBIT_CARD_NAME_DROP_DOWN;
	@FindBy(xpath="//select[@id='D_Bank_Name']")
	WebElement DEBIT_BANK_NAME_TEXT_BOX;
	@FindBy(xpath="//input[@id='D_B_Number']")
	WebElement DEBIT_TRAN_NO_TEXT_BOX;
	@FindBy(xpath= "//input[@id='D_Amt']")
	WebElement DEBIT_AMOUNT_TEXT_BOX;
	@FindBy(xpath="//input[@id='Neft_']")
	WebElement NEFT_RTGS_RADIO_BUTTON;
	@FindBy(xpath="//input[@id='neftTrans_no']")
	WebElement NEFT_TRANS_NO_TEXT_BOX;
	@FindBy(xpath="//input[@id='NeftTrans_date']")
	WebElement NEFT_TRANS_DATE;
	@FindBy(xpath="//select[@id='Bank_Name_neft']")
	WebElement NEFT_BANK_DROP_DOWN;
	@FindBy(xpath="//input[@id='Brach_Number_neft']")
	WebElement NEFT_BRANCH_TEXT_BOX;
	@FindBy(xpath="//input[@id='Amt']")
	WebElement NEFT_AMOUNT_TEXT_BOX;
	@FindBy(xpath="//input[@id='Other_']")
	WebElement OTHER_RADIO_BUTTON_SELECTION;
	@FindBy(xpath="//select[@id='paymentmode_other']")
	WebElement OTHER_PAYMENT_MODE_DROP_DOWN;
	@FindBy(xpath="//input[@id='transactionid_other']")
	WebElement OTHER_TRANSACTION_NO_TEXT_BOX;
	@FindBy(xpath="//input[@id='OtherAmt']")
	WebElement OTHER_AMOUNT_TEXT_BOX;
	@FindBy(xpath="//a[@id='opbilldiagnostic']")
	WebElement REFUND_BUTTON;
	@FindBy(xpath="//table[@id='tbldeposit']//tbody//tr//td")
	WebElement REFUND_ROW_SELECTION;
	@FindBy(xpath="//input[@id='Refund_cash']")
	WebElement REFUND_CASH_RADIO_BUTTON;
	@FindBy(xpath="//input[@id='Cheque_refund']")
	WebElement REFUND_CHEQUE_RADIO_BUTTON;
	@FindBy(xpath="//input[@id='refund_cheque_no']")
	WebElement REFUND_CHEQUE_TEXT_BOX;
	@FindBy(xpath="//select[@id='refund_Bank_Name_cheque']")
	WebElement REFUND_CHEQUE_BANK_DROP_DOWN;
	@FindBy(xpath="//input[@id='refund_Brach_Number']")
	WebElement REFUND_CHEQUE_BRANCH_TEXT_BOX;
	@FindBy(xpath="//input[@id='Cheque_Amount_refund_Number']")
	WebElement REFUND_CHEQUE_AMOUNT_TEXT_BOX;
	@FindBy(xpath="//input[@id='RA_Refund']")
	WebElement REFUND_AMOUNT_TEXT_BOX;
	@FindBy(xpath="//a[@id='Refund']//i[@class='fa fa-rupee']")
    WebElement REFUND_BUTTON_SELECTION;
	@FindBy(xpath="//a[@id='btnRefConfirmYes']")
	WebElement REFUND_CONFIRMATION_YES;


	public DepositAndRefundPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterERNoInTextBox(String erno) {
		try {
			DEPOSIT_REFUNDS_TAB.click();
			ER_NO_TEXT_BOX2.sendKeys(erno);
			ER_NO_TEXT_BOX2.sendKeys(Keys.ENTER);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void enterAmountInCashtMOP(String amount) {
		try {
			AMOUNT_TEXT_BOX.sendKeys(amount);
			DEPOSIT_BUTTON.click();
			CONFIRM_DEPOSIT_YES_OPTION.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void depositAmountByChequeMOP(String cheque,String issue,String bank,String branch,String amount) {
		try {
			CHEQUE_RADIO_BUTTON.click();
			CHEQUE_NO_TEXT_BOX.sendKeys(cheque);
			CHEQUE_ISSUE_DATE.sendKeys(issue);
			Select select1=new Select(CHEQUE_BANK_DROP_DOWN);
			select1.selectByVisibleText(bank);
			CHEQUE_BRANCH_NAME.sendKeys(branch);
			CHEQUE_AMOUNT_TEXT_BOX.sendKeys(amount);
			DEPOSIT_BUTTON.click();
			CONFIRM_DEPOSIT_YES_OPTION.click();
			Thread.sleep(50000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void depositAmountByCreditMOP(String card,String cardname,String bank,String trans,String amount) {
		try {
			CREDIT_CARD_RADIO_BUTTON.click();
			CREDIT_CARD_NO_TEXT_BOX.sendKeys(card);
			Select select=new Select(CREDIT_CARD_NAME_DROP_DOWN);
			select.selectByVisibleText(cardname);
			Select select1=new Select(CREDIT_BANK_NAME_DROP_DOWN);
			select1.selectByVisibleText(bank);
			CREDIT_TRANS_NO_TEXT_BOX.sendKeys(trans);
			CREDIT_AMOUNT_TEXT_BOX.sendKeys(amount);
			DEPOSIT_BUTTON.click();
			CONFIRM_DEPOSIT_YES_OPTION.click();	
			Thread.sleep(4000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void depositAmountByDebitMOP(String card,String cardname,String bank,
			String trans,String amount) {
		try {
			DEBIT_RADIO_BUTTON_SELECTION.click();
			DEBIT_CARD_NO_TEXT_BOX.sendKeys(card);
			Select select=new Select(DEBIT_CARD_NAME_DROP_DOWN);
			select.selectByVisibleText(cardname);
			Select select1=new Select(DEBIT_BANK_NAME_TEXT_BOX);
			select1.selectByVisibleText(bank);
			DEBIT_TRAN_NO_TEXT_BOX.sendKeys(trans);
			DEBIT_AMOUNT_TEXT_BOX.sendKeys(amount);
			DEPOSIT_BUTTON.click();
			CONFIRM_DEPOSIT_YES_OPTION.click();	
			Thread.sleep(4000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void depositAmountByNEFTMOP(String trans,String date,
			String bank,String branch,String amount) {
		try {
			NEFT_RTGS_RADIO_BUTTON.click();
			NEFT_TRANS_NO_TEXT_BOX.sendKeys(trans);
			NEFT_TRANS_DATE.sendKeys(date);
			Select select=new Select(NEFT_BANK_DROP_DOWN);
			select.selectByVisibleText(bank);
			NEFT_BRANCH_TEXT_BOX.sendKeys(branch);
			NEFT_AMOUNT_TEXT_BOX.sendKeys(amount);
			DEPOSIT_BUTTON.click();
			CONFIRM_DEPOSIT_YES_OPTION.click();
			Thread.sleep(4000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void depositAmountByOtherMOP(String pay,String trans,String amount) {
		try {
			OTHER_RADIO_BUTTON_SELECTION.click();
			Select select=new Select(OTHER_PAYMENT_MODE_DROP_DOWN);
			select.selectByVisibleText(pay);
			OTHER_TRANSACTION_NO_TEXT_BOX.sendKeys(trans);
			OTHER_AMOUNT_TEXT_BOX.sendKeys(amount);
			DEPOSIT_BUTTON.click();
			CONFIRM_DEPOSIT_YES_OPTION.click();
			Thread.sleep(4000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void refundButtonSelection() {
		REFUND_BUTTON.click();
	}
	public void refundOfDepositAmountByCash(String amount) throws InterruptedException {
		try {
		REFUND_ROW_SELECTION.click();
		REFUND_CASH_RADIO_BUTTON.click();
		REFUND_AMOUNT_TEXT_BOX.sendKeys(amount);
		REFUND_BUTTON_SELECTION.click();
		REFUND_CONFIRMATION_YES.click();
		Thread.sleep(4000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void refundOfDepositAmountByCredit(String cheque,
			String bank,String branch,String amount1) {
		try {
		REFUND_ROW_SELECTION.click();
		REFUND_CHEQUE_RADIO_BUTTON.click();
		REFUND_CHEQUE_TEXT_BOX.sendKeys(cheque);
		Select select=new Select(REFUND_CHEQUE_BANK_DROP_DOWN);
		select.selectByVisibleText(bank);
		REFUND_CHEQUE_BRANCH_TEXT_BOX.sendKeys(branch);
		REFUND_CHEQUE_AMOUNT_TEXT_BOX.sendKeys(amount1);
		REFUND_BUTTON_SELECTION.click();
		REFUND_CONFIRMATION_YES.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
