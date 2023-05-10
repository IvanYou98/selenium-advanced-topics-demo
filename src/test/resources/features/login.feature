Feature: Login functionality
  @positive
  Scenario: Valid login
    Given I am on the login page
    When I enter the valid credential
    And click the login button
    Then I should be directed to the dashboard page

  @negative
  Scenario: Invalid login
    Given I am on the login page
    When I enter the invalid credential
    And click the login button
    Then I should stay in the login page