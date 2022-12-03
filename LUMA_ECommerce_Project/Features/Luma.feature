Feature: Validation of Luma Application

Scenario: TC_01 Validation of Account Creation
Given user lanuch the Appliction
And   user click Create Account option
When  user enter Personal and Signin informtion
And   user click Create an account button
Then  user verify the Account creation

Scenario: TC_02 Validating Email Subscription
When user enter email Subscription
And user click subscribe button
Then user getting email subscription messge

Scenario: TC_03 Validate login function
And   user click signin option
Then  user enter login Page
When  user enter valid credentials
And   user click login button
Then  user verify the Page is  Successfully login.

Scenario: TC_04 Banner Image funtion
When  User capture the image
When  User getting Image properties
Then  User verifying the image capture successfully

Scenario: TC_05 Search bar function
When user searching products in searchbar
And  user clicks the product
Then user verify productt add to cart  

Scenario: TC_06 Validating the Appbar
And  user click the Womenbar
When user search the womenproduct
Then user verify the page is navigated

Scenario: TC_07 Validating the Addtocart
And user clicks size of the product
And user clicks colour of the product
And user clicks addtocat button
Then user verify the product is added into the cart

Scenario: TC_08 Validating cart function
And user click the addtocart 
And user click the procced button
Then user navigate purchase page

Scenario: TC_09 Validating the purchase
When user enter Address 
And user enter rate of product
And user enter next button
Then user enter payment Portion
And  user place the order
Then verify the order placed and capture Order ID




     