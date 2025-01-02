Feature: AddEmployee functionality

  @addemployee
  Scenario: Adding valid Employee details
    When user logs in with username "nikhil.pachipala@optimworks.com" and password "12345678"
    Then verify that the application navigates to the dashboard
    And click to add the employee details
    And ensure that the user is able to log out successfully
    Then confirm that the user is redirected back to the login page

  @addemployeewithDatatablewithStaticandRandomData
  Scenario: Adding valid Employee details
    When user logs in with username "nikhil.pachipala@optimworks.com" and password "12345678"
    Then verify that the application navigates to the dashboard
    And click to add the employee details with following datails
      | firstName | empLastName | employeeid       | emailId          | Role     | password | dob         | JOD        | Qualification | department | gender | PhoneNo    | BloodGroup | designation | salary | location  | reportingTo                     |
      | aaaaa     | bbbbb       | 101fghi          | abcdff@gmail.com | Employee | 12345678 | 20-09-20002 | 19-11-2024 | B.Tech        | Testing    | Male   | 1234567890 | A+         | Employee    |  50000 | Hyderabad | nikhil.pachipala@optimworks.com |
      | vcvbnm    | dfghj       | randomEmployeeId | randomEmail      | Employee | 12345678 | 20-09-20002 | 19-11-2024 | B.Tech        | Testing    | Male   | 1234567890 | B+         | Employee    |  50000 | Hyderabad | nikhil.pachipala@optimworks.com |
    And ensure that the user is able to log out successfully
    Then confirm that the user is redirected back to the login page

  @addemployeewithDatatable
  Scenario: Adding valid Employee details
    When user logs in with username "nikhil.pachipala@optimworks.com" and password "12345678"
    Then verify that the application navigates to the dashboard
    When click to add the employee details with switch case operation
      | key           | value                           |
      | firstName     | aaaaa                           |
      | empLastName   | bbbbb                           |
      | employeeid    |                        12345749 |
      | emailId       | abcddffykgijkmi@mil.com         |
      | Role          | Employee                        |
      | password      |                       123456790 |
      | dob           | 20-09-20002                     |
      | JOD           | 19-11-2024                      |
      | Qualification | B.Tech                          |
      | department    | Testing                         |
      | gender        | Male                            |
      | PhoneNo       |                      1234567890 |
      | BloodGroup    | B-                              |
      | designation   | Employee                        |
      | salary        |                           23456 |
      | location      | Hyderabad                       |
      | reportingTo   | nikhil.pachipala@optimworks.com |
    Then verify the user can search with the employeeid for edit
      | 12345749 |
    Then employee edit their name with the newName "raju" and dob as "20-09-2000"
    Then verify the user can search with the employeeid for delete
      | 12345749 |
    #When user can click on delete button by the filtered employeeId
    And ensure that the user is able to log out successfully
    Then confirm that the user is redirected back to the login page
