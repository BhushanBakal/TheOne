package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {
	WebDriver driver;
	
	public ProductListingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'pink drop shoulder oversized t shirt')]") 
	private WebElement firstItemOnPage;
	
	@FindBy(how = How.ID, using = "pa_color") 
	private WebElement selectItemColour;
	
	@FindBy(how = How.ID, using = "pa_size") 
	private WebElement selectItemSize;
	
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add to cart')]") 
	private WebElement addToCart;
	
	
	public void clickOn_firstItemOnPage() {
		firstItemOnPage.click();
	}
	
	public void clickOn_selectItemColour() {
		 selectItemColour.sendKeys("pink");
				
	}
	public void clickOn_selectItemSize() {
		selectItemSize.sendKeys("37");
	
	}
	
	public void clickOn_AddToCart() {
		addToCart.click();
	}

}
