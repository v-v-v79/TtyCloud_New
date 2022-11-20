Feature: Accessing all the main modules
  of the app
  As a user, I should be able accessing all the main modules of the app
@ui

  Scenario Outline: verify user login successfully "<username>"
    Given user is on the login page
    When user  enter valid "<username>" and "<password>"
    And user click login button
    Then user should be able accessing all the main modules
    Examples:
      | username | password    |
      | User3    | Userpass123 |

