Feature: Test Cogmento Application

  Scenario: Test Login functionality
    Given user on login page
    When user enter valid username and password
    Then click on login
