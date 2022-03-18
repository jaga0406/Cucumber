
@tag
Feature: login to FB


  @tag1
  Scenario:  Login to Facebook Application with valid Credentials
    Given Open FB URL
    When User enter valid credentials
    And Click on Login button
    Then Application should not display the validation Message


 
   