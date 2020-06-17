Feature: Free CRM login feature

Scenario: Free CRM login Test Scenario

Given user is already on login page
When title of page is Free CRM
Then user enters username and password
Then user clicks on login button
And user is on home page
Then user closes the browser