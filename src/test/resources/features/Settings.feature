@wip
Feature:

  Background:
    Given the user is logged in

  Scenario: Verify personnel settings info label
    When the user clicks the settings label
    Then user should be on the user settings page

  Scenario: Verify personnel settings info label
    When the user clicks the settings label
    Then user should be see the below label
      | Full name    |
      | Email        |
      | Phone number |
      | Address      |
      | Website      |
      | Twitter      |
      | Language     |
      | Local        |




