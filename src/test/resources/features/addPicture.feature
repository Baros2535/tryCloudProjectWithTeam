Feature: Add picture to Gallery

  Scenario: Upload
    Given The user is already logged in
    Then The user clicks to gallery symbol on the header
    Then The user cliks to plus icon
    Then The user sends FilePath address of image to upload icon
    And original image name must be the same with uploaded image