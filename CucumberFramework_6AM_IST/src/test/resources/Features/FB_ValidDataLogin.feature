

Feature: login to FB



  Scenario:  Login to Facebook Application with valid Credentials
    Given Open FB URL
    When User enter valid credentials
    And Click on Login button
    Then Application should not display the validation Message


 
   