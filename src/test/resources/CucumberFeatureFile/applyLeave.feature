Feature: ApplyLeave functionality

  @addemployee
  Scenario: Adding valid Employee details
    When user logs in with username "nikhil.pachipala@optimworks.com" and password "12345678"
    #Then verify that the application navigates to the dashboard
    #And click to add the employee details
    #And ensure that the user is able to log out successfully
    #Then confirm that the user is redirected back to the login page
    #When login with created employee username and password
    #Then verify that the application navigates to the dashboard
    #When employee will Apply for the leave
    #And ensure that the user is able to log out successfully
    #Then confirm that the user is redirected back to the login page
    #When user logs in with username "nikhil.pachipala@optimworks.com" and password "12345678"
    Then click on the LeaveManagent to approve the LeaveRequest
