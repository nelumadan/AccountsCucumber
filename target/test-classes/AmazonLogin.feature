Feature: Login Action

  Scenario: Successful login with valid credentials
    Given User is on Home page
    When User navigate to Login page
    And User enters UserName and Password
    Then Message displayed login successfully

  Scenario: Successful Logout 
    When User logout from application
    Then Message displayed logout successfully

    
