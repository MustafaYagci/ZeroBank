@aa1
Feature: Navigating to a specific accounts in Accounts Activity

    @totalaa
    Scenario Outline: Checking <Link> redirected
      Given User enter the valid username and password
      When the user click "<Link>" link on the Account Summary page
      Then the "Account Activity" page should be displayed
      And Account drop down should have "<Link>" selected

      Examples:
      |Link|
      |Savings|
      |Brokerage|
      |Checking|
      |Credit Card|
      |Loan|
