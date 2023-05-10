Feature: To test E2E Automation Test Case
Description:To test end to end order placement feature of shopping site.

Scenario: Customer places order by selecting first item on home page

Given User navigates to home page
When user selects the first product
And user successfully adds it to the bag
And user continues to Cart Page from mini cart icon at the top right corner
And user moves forward to Checkout page
And user choose to be an ANONYMOUS USER (Not Registering) completes email and address details
And user selects FREE delivery, and places the order using default payment method
Then Verify order details and close the window