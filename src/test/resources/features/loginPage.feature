Feature: login options
  @wips
  Scenario: user login
    Given the user is on the login page
    When the user logged in with "Employee61" "Employee123"
    Then the user is  on the MainPage