Feature: Login to the account

  Scenario: User is able to login to the account
    Given user goes to the "amazon " page
    And user clicks on login button
    When user enters the wrong  "username"
    Then user is prompted to enter the correct username
