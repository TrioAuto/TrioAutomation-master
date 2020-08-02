package com.main.his.src.Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.his.src.base.TestBase;

public class HomePage  extends TestBase
{

	@FindBy(xpath="//li[@id='btn_Emergency']//a//img")
	WebElement ermodule;

	@FindBy(xpath="//a[@id='btn_yes_desh']")
	WebElement MODULE_YES_OPTION_SELECTION;

	@FindBy(xpath="//li[@id='btn_Nursing']//a//img")
	WebElement nursingmodule;

	@FindBy(xpath="//li[@id='btn_Generalitem']//a//img")
	WebElement generalitemmodule;

	@FindBy(xpath="//li[@id='btn_AR']//span//a")
	WebElement armodule;

	@FindBy(xpath="//li[@id='btn_DC']//span//a")
	WebElement dcmodule;

	@FindBy(xpath="//a[contains(text(),'ER Registration')]//i[2]")
	WebElement menubar;

	@FindBy(xpath="//i[@class='fa fa-file-text-o fa-lg']")
	WebElement ER_BILLING_DROP_DOWN;

	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public ERRegistrationPage clickOnErModule() {
		ermodule.click();
		MODULE_YES_OPTION_SELECTION.click();
		return new ERRegistrationPage();
	}
	public NursingActivityPage clickOnNursingModule() {
		nursingmodule.click();
		return new NursingActivityPage();
	}
	public GeneralItemPage clickOnGeneralItemModule() {
		generalitemmodule.click();
		return new GeneralItemPage();
	}
	public DischargeSummaryPage clickOnDischagesummaryModule() {
		dcmodule.click();
		return new DischargeSummaryPage();
	}
	public void clickOnERRegistration(String option) {
		WebElement options=driver.findElement(By.xpath("//ul[@style='display: block;']//a[text()='"+option+"']"));
		options.click();
	}
	public void clickOnERBillingDropDown(String option) {
		WebElement options=driver.findElement(By.xpath("//ul[@style='display: block;']//a[text()='"+option+"']"));
		options.click();
	}
	public void clickOnERBillingLeftButtons(String option) throws InterruptedException {
		WebElement options=driver.findElement(By.xpath("//div[@id='itemlist']//a[@id='"+option+"']"));
		options.click();
		if(option.equals("PendingInvestigation")) 
		{
			TestBase.clickOnPrintAndHandleAnotherPopUpWindow();
		}
	}
	public void clickOnMenubar() {
		menubar.click();
	}
	public void clickOnERBillingDrpDwn() {
		ER_BILLING_DROP_DOWN.click();
	}

}
