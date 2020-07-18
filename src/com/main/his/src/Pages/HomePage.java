package com.main.his.src.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.his.src.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//li[@id='btn_Emergency']//a//img")
	WebElement ermodule;
	
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
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public ERRegistrationPage clickOnErModule() {
		 ermodule.click();
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
	public void clickOnMenubar() {
		menubar.click();
	}
	
}
