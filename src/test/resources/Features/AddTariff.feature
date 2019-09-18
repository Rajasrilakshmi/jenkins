

Feature: AddTariff flow

  Background: 
    Given user should be in the telecom home pagee
    And user click on add tariff button

  Scenario: 
    When user enters all the fields with valid dataA
      | 7000 | 200 | 120 | 100 | 5 | 10 | 2 |
    And user clicks on submit buttonn
    Then user should be displayed home is generated

  Scenario: 
    When user enters all the fields with valid dataB
      | MonRen  | 7000 |
      | locMin  |  200 |
      | IntMin  |  120 |
      | Sms     |  100 |
      | locChrg |    5 |
      | IntChrg |   10 |
      | SmsChrg |    2 |
    And user clicks on submit buttonn
    Then user should be displayed home is generated

  Scenario Outline: 
    When user enters all the fields with valid dataC"<MonRen>","<locMin>","<IntMin>","<Sms>","<locChrg>","<IntChrg>","<SmsChrg>"
    And user clicks on submit buttonn
    Then user should be displayed home is generated

    Examples: 
      | MonRen | locMin | IntMin | Sms | locChrg | IntChrg | SmsChrg |
      |   7000 |    200 |    120 | 100 |       5 |      10 |       2 |
      |   6000 |    100 |    140 |  90 |       6 |      11 |       1 |
