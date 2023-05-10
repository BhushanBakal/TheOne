package com.pageObjects;

import java.util.List;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "billing_first_name") 
	private WebElement billingFirstName;
	
	@FindBy(how = How.ID, using = "billing_last_name") 
	private WebElement billingLastName;
	
	@FindBy(how = How.ID, using = "billing_company") 
	private WebElement billingCompany;
	
	@FindAll(@FindBy(how = How.CSS, using = "#billing_country_field .select2-arrow")) 
	private List<WebElement> countryList;
	
	@FindBy(how = How.ID, using = "billing_address_1") 
	private WebElement billingAddressLine1;	
	
	@FindBy(how = How.ID, using = "billing_address_2") 
	private WebElement billingAddressLine2;
	
	@FindBy(how = How.ID, using = "billing_city") 
	private WebElement billingCity;
	
	@FindBy(how = How.ID, using = "billing_phone") 
	private WebElement billingPhone;
	
	@FindBy(how = How.ID, using = "billing_postcode") 
	private WebElement billingPostcode;
	
	@FindBy(how = How.XPATH, using = "//input[@type='email']") 
	private WebElement billingEmail;
	
	
	@FindBy(how = How.CSS, using = "#terms.input-checkbox") 
	private WebElement acceptTC;
	
	@FindBy(how = How.ID, using = "place_order") 
	private WebElement placeOrder;
	

	public void enter_Name(String name) {
		billingFirstName.sendKeys(name);
	}
	
	public void enter_LastName(String lastName) {
		billingLastName.sendKeys(lastName);
	}

	public void enter_Email(String email) {
		billingCompany.sendKeys(email);
	}
	
	public void enter_Phone(String phone) {
		billingPhone.sendKeys(phone);
	}
	
	public void enter_City(String city) {
		billingCity.sendKeys(city);
	}
	
	public void enter_AddressLine1(String address) {
		billingAddressLine1.sendKeys(address);
	}
	
	public void enter_AddressLine2(String address) {
		billingAddressLine2.sendKeys(address);
	}
	
	public void enter_PostCode(String postCode) {
		billingPostcode.sendKeys(postCode);
	}
	
	
	public void select_Country(String countryName) throws InterruptedException {
		for(WebElement country : countryList){
			if(country.getText().equals("India")) {
				country.click();	
				Thread.sleep(3000);
				break;
			}	
		}
	}
	
	public void check_TermsAndCondition() {
		try {
			acceptTC.click();
		} catch (ElementClickInterceptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickOn_PlaceOrder() {
		placeOrder.submit();
	}

}
