Feature: Login Functionality

  @loginWithDataTableConcept
  Scenario: login with valid credientials
    When user logs in with valid username and password credentials
      | username                        | password |
      | nikhil.pachipala@optimws.com    | 12345678 |
      | nikhil.pachipala@optimworks.com |    12345 |
      | nikhil.pachipala@optimworks.com | 12345678 |
    Then verify that the application navigates to the dashboard
    And ensure that the user is able to log out successfully
    Then confirm that the user is redirected back to the login page

  @login
  Scenario: login with valid credientials
    When user logs in with username "nikhil.pachipala@optimworks.com" and password "12345678"
    Then verify that the application navigates to the dashboard
    And ensure that the user is able to log out successfully
    Then confirm that the user is redirected back to the login page
    
    
    
