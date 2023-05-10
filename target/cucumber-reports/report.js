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
  "duration": 19955383800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsSteps.user_selects_the_first_product()"
});
formatter.result({
  "duration": 10562100000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsSteps.user_successfully_adds_it_to_the_bag()"
});
formatter.result({
  "duration": 5828037200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsSteps.user_continues_to_Cart_Page_from_mini_cart_icon_at_the_top_right_corner()"
});
formatter.result({
  "duration": 2733629300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsSteps.user_moves_forward_to_Checkout_page()"
});
formatter.result({
  "duration": 2137873500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsSteps.user_choose_to_be_an_ANONYMOUS_USER_Not_Registering_completes_email_and_address_details()"
});
formatter.result({
  "duration": 3873267800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsSteps.user_selects_FREE_delivery_and_places_the_order_using_default_payment_method()"
});
formatter.result({
  "duration": 209752400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsSteps.verify_order_details_and_close_the_window()"
});
formatter.result({
  "duration": 969012500,
  "status": "passed"
});
});