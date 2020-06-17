Feature: BigBasket login feature

#Scenario: Bigbasket login scenario
#
#Given user launches the BB portal
#Then user clicks on login link
#And user enters "7387444570"
#Then user clicks on login using OTP
#And user closes the BB browser

Scenario Outline: Bigbasket login scenario

Given user launches the BB portal
Then user clicks on login link
And user enters "<mobileNum>"
Then user clicks on login using OTP
And user closes the BB browser

Examples:
	|mobileNum|
	|7387444570|
	|9421223939|