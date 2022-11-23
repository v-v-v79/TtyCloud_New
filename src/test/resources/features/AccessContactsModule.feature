

Feature: As a user, I should be able to access to Contacts module.
  @wip
  Scenario:  verify user access to Contacts module

    Given the user on dashboard page
    When user clicks "Contacts" module
    Then verify the page title is "Contacts - Trycloud QA"