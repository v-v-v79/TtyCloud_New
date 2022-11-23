
    Feature: As a user, I should be able to log in.
    @wip
    Scenario Outline: Verify user login fail with invalid credentials
    Given the user is on the login page
    When user enter invalid "<username>" and "<password>"
    And user clicks the login button
    Then verify "<message>" message should be Wrong username or password.
    Examples:
      | username | password | message                     |
      | user     | wrong    | Wrong username or password. |
