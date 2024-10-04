
Feature: This feature has 4 scenarios that test the - https://www.nytimes.com/ for different scenarios.

Background: User is on Login Page
    Given user navigates to Nytimes page
    And user clicks on Login button
    Then user should navigate to Login Screen

Scenario: Validate error message should be displayed when incorrect email is entered
    Given user enters an invalid email
    And user clicks on continue button
    Then error message should be displayed


Scenario: Validate user should be taken to create your account page when no previous account exist for entered email id
    Given user enters a valid email
    And user clicks on continue button
    Then user should navigate to create account page


Scenario: Validate user should be able to edit the email id on Create Account Page
    Given user enters a valid email
    And user clicks on continue button
    Then should be able to edit the email id
