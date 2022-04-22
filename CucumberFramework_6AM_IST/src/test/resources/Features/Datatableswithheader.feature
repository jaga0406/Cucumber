

Feature: login feature for orange HRM

@justScenario
  Scenario: This is the positive login scenario
     Given user want to login in login page
    When the user enters valid data
    |UserName | PassWord|
    |Admin    | admin123|
    And presses the login button



