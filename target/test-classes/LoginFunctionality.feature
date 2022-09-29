Feature: Check login functionality

  Scenario: User Entered Valid credentials and logged in successfully into whitebox website
    Given The user is in whitebox login page
    And The user enters valid username and password
    When He clicks login button
    Then The login successfully is displayed
