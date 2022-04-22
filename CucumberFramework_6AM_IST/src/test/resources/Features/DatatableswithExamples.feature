


Feature: This is to test whether the login feature for orange HRM

@Scenariooutline
  Scenario Outline: This is the positive login scenario with outline for Examples
     Given user wants to login in login page
    When the user enters username "<UserName>" and password "<PassWord>"
    And pressed the login button
  Examples: 
    |UserName | PassWord|
    |Admin    | admin123|
    |Jaga     | epovumaemassda|