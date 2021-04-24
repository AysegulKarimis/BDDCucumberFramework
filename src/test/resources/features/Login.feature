# Author: Cemil Koc

Feature: Sauce Labs Login
  @checkout @abc
  Scenario: Valid login
    Given I am on the login page
    When I enter valid username in the username field
    And I enter valid password in the password field
    And I click on the login button
    Then I see the home page
  @checkout
  Scenario: Invalid login
    Given I am on the login page
    When I enter invalid username in the username field
    And I enter invalid password in the password field
    And I click on the login button
    Then I see the error message