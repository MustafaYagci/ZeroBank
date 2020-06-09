@as
Feature: Account Feature
  Scenario: Account Summary
    Given User enter the valid username and password
    When account summary page should have the title "Zero - Account Summary"
    And account summary page must have following modules
      |Cash Accounts|
      |Investment Accounts|
      |Credit Accounts|
      |Loan Accounts |

   Then  Credit Accounts table must have columns
         |Account|
         |Credit Card|
         |Balance|

