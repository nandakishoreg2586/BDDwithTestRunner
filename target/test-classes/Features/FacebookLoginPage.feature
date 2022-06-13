#comments 
#@SmokeScenario
Feature: This is to test the logiin page of fb

@SmokeTest
Scenario: Thsi is to validate the launch of Fb login page

Given user launches fb home page
When user clicks on login button
Then error is displayed to enter username and password



#Scenario Outline: Thsi is to validate the launch of Fb login page
#
#Given user launches fb home page
#When user clicks on <login> button
#Then error is displayed to enter <username> and <password>
#
#Examples:
#| username | password |
#| nanda    | nanda    |



