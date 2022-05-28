@batch24
Feature: User able to login to orange HRM site
Scenario: User successfully login to orange HRM
Given User go to orange HRM home page
When User type the username
And User also type the password
Then user click on the login button
And User varify the welcome page