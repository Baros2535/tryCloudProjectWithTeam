@SelimBurakMutlu
Feature: Add picture to Gallery

  Background:
    Given the user is logged in

  Scenario: Upload

    Then The user clicks to gallery symbol on the header
    Then The user cliks to plus icon
    Then The user sends FilePath address of image to upload icon
    And original image name must be the same with uploaded picture