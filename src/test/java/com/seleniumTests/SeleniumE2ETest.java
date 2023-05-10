package com.seleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumE2ETest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BhushanB2\\eclipse-workspace\\FramworkJavaBDD\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://shop.demoqa.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		
	    WebElement firstItemOnPage=driver.findElement(By.xpath("//a[contains(text(),'pink drop shoulder oversized t shirt')]"));
	    firstItemOnPage.click();
		
	    js.executeScript("window.scrollBy(0,750)", "");
		
		Select selectItemColour = new Select(driver.findElement(By.xpath("//select[@id='pa_color']")));
		selectItemColour.selectByValue("pink");
		
		Select selectItemSize = new Select(driver.findElement(By.xpath("//select[@id='pa_size']")));
		selectItemSize.selectByValue("37");
		
		WebElement addToCart= driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
		addToCart.click();
		
		WebElement clickIntoCart = driver.findElement(By.xpath("//span[@class='cart-name-and-total']"));
		clickIntoCart.click();
		
		js.executeScript("window.scrollBy(0,350)", "");
		
		WebElement proceedToCheckout= driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
		proceedToCheckout.click();
		
		js.executeScript("window.scrollBy(0,350)", "");
		
		WebElement billingFirstName= driver.findElement(By.id("billing_first_name"));
		billingFirstName.sendKeys("Bhushan");
		
		WebElement billingLastName=driver.findElement(By.id("billing_last_name"));
		billingLastName.sendKeys("Bakal");
		
		WebElement billingCompany= driver.findElement(By.id("billing_company"));
		billingCompany.sendKeys("CitiusTech");
		
		List<WebElement> countryList = driver.findElements(By.cssSelector("#select2-drop ul li"));
		for(WebElement country : countryList){
			if(country.getText().equals("Indonesia")) {
				country.click();	
				Thread.sleep(3000);
				break;
			}	
		}
		//country.selectByVisibleText("Indonesia");*/
		
		WebElement billingAddressLine1= driver.findElement(By.id("billing_address_1"));
		billingAddressLine1.sendKeys("C/o Temple lane");
		
		WebElement billingAddressLine2= driver.findElement(By.id("billing_address_2"));
		billingAddressLine2.sendKeys("near poleline");
		
		WebElement billingCity= driver.findElement(By.id("billing_city"));
		billingCity.sendKeys("Akola");
		
		WebElement billingPhone= driver.findElement(By.id("billing_phone"));
		billingPhone.sendKeys("987654321");
		
		WebElement billingPostcode= driver.findElement(By.id("billing_postcode"));
		billingPostcode.sendKeys("888666");
		
		WebElement billingEmail= driver.findElement(By.xpath("//input[@type='email']"));
		billingEmail.sendKeys("bhushan@gmail.com");
		
		Thread.sleep(5000);
		WebElement acceptTC = driver.findElement(By.cssSelector("#terms.input-checkbox"));
		acceptTC.click();
		
		
		WebElement placeOrder= driver.findElement(By.id("place_order"));
		placeOrder.submit();
		
		System.out.println("Order Placement Successful");
		
		driver.close();
		
		
	}
		
}


