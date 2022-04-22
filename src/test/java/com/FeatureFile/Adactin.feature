Feature: To check the adactin funtionality

  Scenario: user to check the login function with valid username and password
    Given user is in login page
    When user gives the valid username and password
    Then user clicks the login button
    And user should be able to see the next page


 