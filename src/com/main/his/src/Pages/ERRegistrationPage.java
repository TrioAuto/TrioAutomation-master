package com.main.his.src.Pages;


import java.awt.Label;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.his.src.base.TestBase;


public class ERRegistrationPage extends TestBase {

	private static final Logger log=Logger.getLogger(ERRegistrationPage.class.getName());

	@FindBy(xpath="//select[@id='_title']")
	WebElement TITLE_DROP_DOWN;
	@FindBy(xpath="//input[@id='f_name']")
	WebElement fname;
	@FindBy(xpath="//input[@id='m_name']")
	WebElement mname;
	@FindBy(xpath="//input[@id='l_name']")
	WebElement lname;
	@FindBy(xpath="//select[@id='_sex']")
	WebElement gender;
	@FindBy(id="chkage")
	WebElement AGE_RADIO_BUTTON;
	@FindBy(id="_age")
	WebElement AGE_TEXT_BOX;
	@FindBy(xpath="//input[@id='_chkfather']")
	WebElement fcheckbox;
	@FindBy(xpath="//input[@id='fs_name']")
	WebElement FATHER_TEXT_BOX;
	@FindBy(xpath="//select[@id='M_status']")
	WebElement MARITAL_STATUS_DROPDOWN;
	@FindBy(xpath="//input[@id='_address']")
	WebElement ADDRESS_TEXT_BOX;
	@FindBy(xpath="//select[@id='_city']")
	WebElement CITY_DROP_DOWN;
	@FindBy(xpath="//select[@id='_locality']")
	WebElement LOCALITY_TEXT_BOX;
	@FindBy(xpath="//a[@id='add_city']//i")
	WebElement ADD_CITY_BUTTON;
	@FindBy(xpath="//input[@id='modal_city']")
	WebElement CITY_FROM_POPUP;
	@FindBy(xpath="//select[@id='distric_modal']")
	WebElement DISTRICT_FROM_CITYPOP;
	@FindBy(xpath="//a[@id='refeshcity']//i")
	WebElement CLEAR_BUTTON_FROM_CITYPOPUP;
	@FindBy(xpath="//a[@id='city_save']//i")
	WebElement SAVE_FROM_CITYPOPUP;
	@FindBy(xpath="//a[@id='Add_locality']//i")
	WebElement ADD_LOCALITY_PLUS_BUTTON;
	@FindBy(xpath="//input[@id='locaitymodal_locality']")
	WebElement LOCALITY_FROM_POPUP;
	@FindBy(xpath="//input[@id='locaitymodal_pincity']")
	WebElement PIN_FROM_POPUP;
	@FindBy(xpath="//a[@id='locaitymodal_save']//i")
	WebElement SAVE_BUTTON_LOCALITY_POPUP;
	@FindBy(xpath="//select[@id='_nationality']")
	WebElement NATIONALITY_TEXT_BOX;
	@FindBy(xpath="//input[@id='txtPNo']")
	WebElement PASSPORT_NO_TEXT_BOX;
	@FindBy(xpath="//input[@id='txtIDate']")
	WebElement PASSPORT_ISSUE_DATE;
	@FindBy(xpath="//input[@id='txtEdate']")
	WebElement PASSPORT_EXPIRY_DATE;
	@FindBy(xpath="//input[@id='txtIFrom']")
	WebElement PASSPORT_ISSUED_FROM_TEXT_BOX;
	@FindBy(xpath="//a[@id='passportYES']")
	WebElement PASSPORT_YES_OPTION;
	@FindBy(xpath="//input[@id='_refBY']")
	WebElement REFERRED_BY_TXT_BOX;
	@FindBy(xpath="//select[@id='ward_type']")
	WebElement WARD_TYPE_SELECTION;
	@FindBy(xpath="//textarea[@id='txtArea']")
	WebElement PATIENT_CONDITION_TXT_BOX;
	@FindBy(xpath="//a[@id='btnsave']//i")
	WebElement MAIN_SAVE_BUTTON;
	@FindBy(xpath="//a[@id='btnSave_Data']")
	WebElement SAVE_YES_OPTION;
	@FindBy(xpath="//a[@id='btnEmergencyReg']")
	WebElement ER_NO_OK_BUTTON;
	@FindBy(xpath="//a[@id='btnsavePrintNO']")
	WebElement Select_Yes_OPTION;
	@FindBy(xpath="//a[@id='PopPrintClose']//i")
	WebElement PRINT_CANCEL_BUTTON;

	//Update details and admit as ip xpath 
//-----------------------------------------------------------------------------------
	@FindBy(xpath="//input[@id='ERNo']")
	WebElement ER_NO_TEXT_BOX;
	@FindBy(xpath="//i[@class='fa fa-pencil-square']")
	WebElement MODIFY_DETAIL_BUTTON;
	@FindBy(xpath="//a[@id='btnticket']//i")
	WebElement ADMIT_AS_IP;
	@FindBy(xpath="//*[@id='PendingOrder_Return_Confirm']")
	WebElement PENDING_ORDER_RETUEN_POP_UP;
	@FindBy(xpath="//select[@id='popdrpBType']")
	WebElement REQUESTED_BED_TYPE_FROM_POP_UP;
	@FindBy(xpath="//select[@id='popdrpABType']")
	WebElement BILLABLE_BED_TYPE_FROM_POP_UP;
	@FindBy(xpath="//select[@id='popdrpBBtype']")
	WebElement ALLOTED_BED_TYPE_FROM_POP_UP;
	@FindBy(xpath="//select[@id='popdrpWard']")
	WebElement WARD_FROM_POP_UP;
	@FindBy(xpath="//select[@id='popdrpBed']")
	WebElement BED_FROM_POP_UP;
	@FindBy(xpath="//a[@id='PopSaveEmergencyPatient']//i")
	WebElement POP_UP_SAVE_BUTTON;
    @FindBy(xpath="//a[contains(text(),'Next Of Kin')]")
    WebElement NEXT_OF_KIN_FROM_POP_UP;
    @FindBy(xpath="//input[@id='txtname']")
    WebElement KIN_DETAIL_NAME;
    @FindBy(xpath="//input[@id='popchekkCopy']")
    WebElement Copy_From_Present_Address;
    @FindBy(xpath="//input[@id='poptxtName']")
    WebElement KIN_EMERGENCY_CONTACT_NAME;
    @FindBy(xpath="//input[@id='EmergencypoptxtPNo']")
    WebElement KIN_EMERGENCY_PHONE_NO;
    @FindBy(xpath="//input[@id='popBCDone']")
    WebElement KIN_COUNSELLING_BILLING_COUNSELLING_DONE;
    @FindBy(xpath="//input[@id='popCCDone']")
    WebElement KIN_CLINICAL_COUNSELLING_DONE_TO;
    @FindBy(xpath="//a[@id='PatientAdmitIPID']")
    WebElement CLICK_ON_OK;
    

	

	public ERRegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	public void selectPatientTitle(String title) {
		Select select=new Select (TITLE_DROP_DOWN);
		select.selectByValue(title);
	}
	public void enterFirstName(String first, String string) {
		fname.sendKeys(first);
	}
	public void clickOnTitleDropDown(String middle,String last,String gen) {
		
		mname.sendKeys(middle);
		lname.sendKeys(last);
		Select sex=new Select(gender);
		sex.selectByVisibleText(gen);
	}
	public void fillAgeByRadioButton(String age,String father,String marital,String address) {

		AGE_RADIO_BUTTON.click();   
		AGE_TEXT_BOX.sendKeys(age);
		fcheckbox.click();
		FATHER_TEXT_BOX.sendKeys(father);
		Select select=new Select(MARITAL_STATUS_DROPDOWN);
		select.selectByValue(marital);
		ADDRESS_TEXT_BOX.sendKeys(address);
	}
	public void selectCityDropDown(String city) throws InterruptedException  {
		Select select=new Select (CITY_DROP_DOWN);
		select.selectByValue(city);
	}
	public void addNewCityBySelectingPlusButton(String city,String district)  {
		ADD_CITY_BUTTON.click();
		CITY_FROM_POPUP.sendKeys(city);
		Select districtDropDown1=new Select(DISTRICT_FROM_CITYPOP);
		districtDropDown1.selectByValue(district);
	}
	public void clickSaveButtonOnCityPopUP() throws InterruptedException {
		SAVE_FROM_CITYPOPUP.click();
	}
	public void addNewLocalityBySelectingPlusButton(String local,String pincode) throws InterruptedException {
		ADD_LOCALITY_PLUS_BUTTON.click();
		Thread.sleep(5000);
		LOCALITY_FROM_POPUP.sendKeys(local);
		Thread.sleep(4000);
		PIN_FROM_POPUP.sendKeys(pincode);
		Thread.sleep(3000);
		SAVE_BUTTON_LOCALITY_POPUP.click();
	}
	public void selectNationalityFromDropDown(String nation,String pass,String issuedate,String expirydate,String issue) throws InterruptedException {
		Select nationality=new Select(NATIONALITY_TEXT_BOX);
		nationality.selectByValue(nation);
		Thread.sleep(4000);
		PASSPORT_YES_OPTION.click();
		PASSPORT_NO_TEXT_BOX.sendKeys(pass);
		PASSPORT_ISSUE_DATE.clear();
		PASSPORT_ISSUE_DATE.sendKeys(issuedate);
		PASSPORT_EXPIRY_DATE.clear();
		PASSPORT_EXPIRY_DATE.sendKeys(expirydate);
		PASSPORT_ISSUED_FROM_TEXT_BOX.sendKeys(issue);
		PASSPORT_YES_OPTION.click();
	}
	public boolean verifyWithoutSelectingAnyData(String msg) {
		if(PASSPORT_YES_OPTION.getText().contains(msg)) {

			return true;
		}
		else {

			return false;
		}
	}
	public void enterReferredBy(String refer) {
		try {
			REFERRED_BY_TXT_BOX.sendKeys(refer);
			REFERRED_BY_TXT_BOX.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//table[@id='tblEmerDocRefSelf']//tbody//td[2]")).click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void selectWardTypeFromDropDown(String ward,String condition) throws InterruptedException {
		Select wardselection=new Select(WARD_TYPE_SELECTION);
		wardselection.selectByValue(ward);
		PATIENT_CONDITION_TXT_BOX.sendKeys(condition);
		Thread.sleep(4000);
		MAIN_SAVE_BUTTON.click();
		Thread.sleep(5000);
		SAVE_YES_OPTION.click();
		Thread.sleep(4000);
		ER_NO_OK_BUTTON.click();
		Thread.sleep(3500);
		Select_Yes_OPTION.click();
		Thread.sleep(4000);
		PRINT_CANCEL_BUTTON.click();
	}
	public void enterRegisteredPatientERNo(String erno) {
		ER_NO_TEXT_BOX.sendKeys(erno);
		log.info("Enter Register patient ER No :"+ erno);
		ER_NO_TEXT_BOX.sendKeys(Keys.ENTER);
		PASSPORT_YES_OPTION.click();
		log.info("Click on Passport PoP-UP YES Option");
		MODIFY_DETAIL_BUTTON.click();
		log.info("Select the modify button");

	}
	public void modifyPateintDetails(String updatefname,String updatelname,String reason) {

		fname.getText();
		log.info("System will pick the first name before updation");
		lname.getText();
		log.info("System will pick the last name before updation ");
		fname.clear();
		log.info("Clear the First name text box");
		lname.clear();
		log.info("Clear the last name text box");
		fname.sendKeys(updatefname);
		log.info("Update the first name :" +updatefname);
		lname.sendKeys(updatelname);
		log.info("Update the last name :" +updatelname);
		ADMIT_AS_IP.click();
		PENDING_ORDER_RETUEN_POP_UP.click();
	}
	public void selectRequestedbedtype(String rbed) 
	{
		Select select=new Select(REQUESTED_BED_TYPE_FROM_POP_UP);
		select.selectByVisibleText(rbed);
		System.out.println("Select the requested bed :"+rbed);
	}

	public void selectAllotedBedType() 
	{
		Select select=new Select(ALLOTED_BED_TYPE_FROM_POP_UP);
		if(select.getOptions().size()>0) 
		{
			List<WebElement> element=select.getOptions();
			///AllotedBedType:
				for(int i=1;i<=element.size();i++)
				{
					select.selectByIndex(i);
					System.out.println("Alloted bed type selected ");
					Select s1=new Select(WARD_FROM_POP_UP);
					List<WebElement> element2=s1.getOptions();


					///WardType:
						for(int j=0;j<element2.size();j++)
						{
							if(!s1.getOptions().isEmpty()) 
							{
								s1.selectByIndex(j);
								System.out.println("ward should be selected="+j);
								Select s2=new Select(BED_FROM_POP_UP);
								if(!s2.getOptions().isEmpty()) {
									System.out.println("bed is selected:"+s2.getOptions());
									break;
								}
								else if(s2.getOptions().isEmpty()) {
									System.out.println("bed is not selected");
								}
							}
						
						}
						break;
				}
		}

	}
	public void fillNextOfKinDetails(String kname,String ename,String ephone,String cbcd,String ccdt ) {
		try {
			NEXT_OF_KIN_FROM_POP_UP.click();
			log.info("kin details tab get selected");
			
			KIN_DETAIL_NAME.sendKeys(kname);
			log.info("Enter kin detail name:"+kname);
			
			Copy_From_Present_Address.click();
			log.info("Copy check box get selected");
			
			KIN_EMERGENCY_CONTACT_NAME.sendKeys(ename);
			log.info("Enter emergency Patient name :"+ename);
			
			KIN_EMERGENCY_PHONE_NO.sendKeys(ephone);
			log.info("Enter Kin Emergency Phone No :"+ephone);
			
			KIN_COUNSELLING_BILLING_COUNSELLING_DONE.sendKeys(cbcd);
			log.info("Enter Clinical Counselling Done To :"+cbcd);
			
			KIN_CLINICAL_COUNSELLING_DONE_TO.sendKeys(ccdt);
			log.info("Enter Clinical Counselling Done To :"+ccdt);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void selectSaveButton() {
		POP_UP_SAVE_BUTTON.click();
		CLICK_ON_OK.click();
	}

}
