
Feature: This is the login feature for orange HRM


@SimpleLogin @Search
  Scenario: This is login scenario
    Given user is on login page
    When the user enters the valid credentials "Admin" and "admin123"
    And clicks on login button
    Then the user should be navigated to home page


