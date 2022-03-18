
@tag
Feature: login to FB


  @tag1
  Scenario: Login to Facebook Application with invalid Credentials
    Given Open FB URL
    When User enter invalid credentials
    And Click on Login button
    Then Application should display the validation Message
    
 