package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[@class='cart-name-and-total']") 
	private WebElement clickIntoCart;
	
	@FindBy(how = How.XPATH, using = "//a[@class=\"checkout-button button alt wc-forward wp-element-button\"]") 
	private WebElement proceedToCheckout;
	
	
	public void clickOn_Cart() {
		clickIntoCart.click();
	}
	
	public void clickOn_ContinueToCheckout(){
		proceedToCheckout.click();
	}
}
