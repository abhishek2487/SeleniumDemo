
Feature: This feature is about the nytimes search functionality

Scenario: User should be able to search for the news
    Given user navigates to Nytimes page
    And user clicks on search button
    And user search for news
    Then results should show the news