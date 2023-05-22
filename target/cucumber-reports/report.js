$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EndToEndTest.feature");
formatter.feature({
  "line": 1,
  "name": "To test E2E Automation Test Case",
  "description": "Description:To test end to end order placement feature of shopping site.",
  "id": "to-test-e2e-automation-test-case",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Customer places order by selecting first item on home page",
  "description": "",
  "id": "to-test-e2e-automation-test-case;customer-places-order-by-selecting-first-item-on-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User navigates to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user selects the first product",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user successfully adds it to the bag",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user continues to Cart Page from mini cart icon at the top right corner",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user moves forward to Checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user choose to be an ANONYMOUS USER (Not Registering) completes email and address details",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user selects FREE delivery, and places the order using default payment method",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify order details and close the window",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationsSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 12199389800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsSteps.user_selects_the_first_product()"
});
formatter.result({
  "duration": 128416100,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d113.0.5672.126)\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027IMCVBCP306-MSL2\u0027, ip: \u0027192.168.101.72\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_311\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.126, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\BHUSHA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58764}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 6aa091faabf104c471ecd5a6587c5890\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027pink drop shoulder oversized t shirt\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat com.pageObjects.ProductListingPage.clickOn_firstItemOnPage(ProductListingPage.java:31)\r\n\tat com.runners.StepDefinationsSteps.user_selects_the_first_product(StepDefinationsSteps.java:48)\r\n\tat ✽.When user selects the first product(EndToEndTest.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinationsSteps.user_successfully_adds_it_to_the_bag()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinationsSteps.user_continues_to_Cart_Page_from_mini_cart_icon_at_the_top_right_corner()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinationsSteps.user_moves_forward_to_Checkout_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinationsSteps.user_choose_to_be_an_ANONYMOUS_USER_Not_Registering_completes_email_and_address_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinationsSteps.user_selects_FREE_delivery_and_places_the_order_using_default_payment_method()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinationsSteps.verify_order_details_and_close_the_window()"
});
formatter.result({
  "status": "skipped"
});
});