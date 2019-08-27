
@regression
Feature: Add TariffPlan Validation
@smoke
  Scenario: Add TariffPlan details with valid data
   Given user should be telecom homepage and navigate to Addtariffplan page
    When user should enter plan details and click submit
    Then user should be displayed with congratulation you add Tariffplan
@sanity
  Scenario: Add TariffPlan details with valid datas
    Given user should be telecom homepage and navigate to Addtariffplan page
    When user should enter plan details in twodlist
      | 432 | 200 | 300 | 54 | 1 | 2 | 3 |
      | 654 | 300 | 400 | 65 | 2 | 3 | 4 |
      | 324 | 987 | 500 | 600 | 8 | 4 | 5 |
      | 675 | 500 | 600 | 987 | 4 | 5 | 6 |
    Then user should be disply with congratulation you add Tariffplan
@regression
  Scenario: Add TariffPlan details with valid data
    Given user should be telecom homepage and navigate to Addtariffplan page
    When user should enter plan details in twodmap
      | MR  | LM  | IM  | SMS | LMC | IMC | SMC |
      | 567 | 654 | 445 | 400 |   1 |   2 |   3 |
      | 432 | 300 | 400 | 500 |   2 |   3 |   4 |
      | 300 | 400 | 500 | 600 |   3 |   4 |   5 |
      | 400 | 500 | 600 | 700 |   4 |   5 |   6 |
    Then user should be display with congratulation you add Tariffplan


