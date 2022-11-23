@regression
Feature: As a user, I should be able to access to Files module.


  Scenario: verify users can access to Files module
    Given user on dashboard page
    When user clicks the Files module
    And user clicks all files box
    And verify the page title is Files-TryCloud Qa.


