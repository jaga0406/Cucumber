

Feature: This is to test Google search
@Search
  Scenario: google search scenario
    Given user is entering google.co.in
    When user is typing the search term "Agniprasath"
    And enters the return key
    Then user should see the search results

  
