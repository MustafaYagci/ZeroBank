@aa
Feature: Account Activity
  Scenario: Way to Account Activity
    Given User enter the valid username and password
    When User shold able to click "Account Activity" module
    Then Account Activity page should have the "Account Activity" title.
    Given Drop down default option should be "Savings"
    And drop down should have the following options
    |Savings|
    |Checking|
    |Savings|
    |Loan|
    |Credit Card|
    |Brokerage|

    When Transactions table should have column names
    |Date|
    |Description|
    |Deposit|
    |Withdrawal|
