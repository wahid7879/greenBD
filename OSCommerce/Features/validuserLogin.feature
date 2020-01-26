Feature: Valid Login at OSCommerce

Scenario: Valid Login with valid username and password

Given i am on the home page of OSCommerce
And i click on My Account
When i enter valid username as "testwahid900@gmail.com" and password as "asdzxc99"
And I click on Sign In Button
Then I should be able to login