
Feature: As a user, I should be able to access to Files module.
  @wip
  Scenario: verify users can access to Files module
    Given user on dashboard page
    When user clicks the Files module
    And verify the page title is Files-TryCloud QA.
    And user clicks all files box
    Then user verifies all checkboxes is selected



