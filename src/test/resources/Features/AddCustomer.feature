

Feature: AddCustomer flow

  Background: 
    Given user should be in the telecom home page
    And user click on add customer button
    
@smoke
  Scenario: 
    When user enters all the fields with valid data
    And user clicks on submit button
    Then user should be displayed customer id is generated

  Scenario: 
    When user enters all the fields with valid data.
      | Rajasri | lakshmi | rajasri@gmail.com | Pondy | 9845673487 |
      And user clicks on submit button
    Then user should be displayed customer id is generated

    Scenario: 
    When user enters all the fields with valid datas
      | fname   | rajasri           |
      | lname   | r                 |
      | email   | rajasri@gmail.com |
      | address | chennai           |
      | phno    |        7984562309 |
    And user clicks on submit button
    Then user should be displayed customer id is generated