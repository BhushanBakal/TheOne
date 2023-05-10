package com.runners;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.managers.FileReaderManager;
import com.managers.PageObjectManager;
import com.pageObjects.CartPage;
import com.pageObjects.CheckoutPage;
import com.pageObjects.HomePage;
import com.pageObjects.ProductListingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings({ "unused", "deprecation" })
public class StepDefinationsSteps {
	
	WebDriver driver;
	HomePage homePage;
	ProductListingPage productListingPage;
	CartPage cartPage;
	CheckoutPage checkoutPage;
	PageObjectManager pageObjectManager;
	

@Given("^User navigates to home page$")
public void user_is_on_home_page()  {
	   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+FileReaderManager.getInstance().getConfigReader().getDriverPath()); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		homePage.navigateTo_HomePage();
}

@When("^user selects the first product$")
public void user_selects_the_first_product() {
	
		productListingPage = pageObjectManager.getProductListingPage();
		productListingPage.clickOn_firstItemOnPage();
}

@When("^user successfully adds it to the bag$")
public void user_successfully_adds_it_to_the_bag() {

		productListingPage.clickOn_selectItemColour();
		productListingPage.clickOn_selectItemSize();
		productListingPage.clickOn_AddToCart();
}

@When("^user continues to Cart Page from mini cart icon at the top right corner$")
public void user_continues_to_Cart_Page_from_mini_cart_icon_at_the_top_right_corner() throws InterruptedException{
	
		cartPage = pageObjectManager.getCartPage();
		cartPage.clickOn_Cart();
}

@When("^user moves forward to Checkout page$")
public void user_moves_forward_to_Checkout_page()  {
	
		cartPage.clickOn_ContinueToCheckout();
}

@When("^user choose to be an ANONYMOUS USER \\(Not Registering\\) completes email and address details$")
public void user_choose_to_be_an_ANONYMOUS_USER_Not_Registering_completes_email_and_address_details() throws Exception  {

		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.enter_Name("myrakosh");
		checkoutPage.enter_LastName("yajkal");
		checkoutPage.select_Country("India");
		checkoutPage.enter_AddressLine1("line 1");
		checkoutPage.enter_AddressLine2("Line 2");
		checkoutPage.enter_City("Delhi");
		checkoutPage.enter_Email("Bhushan@1");
		checkoutPage.enter_Phone("123456789");
		checkoutPage.enter_PostCode("888666");
}

@When("^user selects FREE delivery, and places the order using default payment method$")
public void user_selects_FREE_delivery_and_places_the_order_using_default_payment_method() throws InterruptedException {
	
		checkoutPage.check_TermsAndCondition();
		checkoutPage.clickOn_PlaceOrder();
}

@Then("^Verify order details and close the window$")
public void verify_order_details_and_close_the_window() {
	
	String acutalTitle= driver.getTitle();
	String expectedTitle= "Checkout – ToolsQA Demo Site";
	
	Assert.assertEquals("Validating page title",acutalTitle, expectedTitle);
	
/*
	if (acutalTitle.equals(expectedTitle))
	{
		System.out.println("Order is placed Successfully");	
	}else
	{
		System.out.println("Order placement failed");	
	}
	*/
      driver.quit();
}


}