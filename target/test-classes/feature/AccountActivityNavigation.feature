@aa1
Feature: Navigating to a specific accounts in Accounts Activity
  Scenario:Saving accounts redirected
    Given User enter the valid username and password
    When the user click "Savings" link on the Account Summary page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Savings" selected
  @aa1.2
  Scenario: Brokerage Account Redirected
    Given User enter the valid username and password
    When the user click "Brokerage" link on the Account Summary page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "Brokerage" selected

  @aa1.3
   Scenario: Checking Account Redirected
     Given User enter the valid username and password
     When the user click "Checking" link on the Account Summary page
     Then the "Account Activity" page should be displayed
     And Account drop down should have "Checking" selected
  @aa1.4
   Scenario: Credit Card Account Redirected
     Given User enter the valid username and password
     When the user click "Credit Card" link on the Account Summary page
     Then the "Account Activity" page should be displayed
     And Account drop down should have "Credit Card" selected

  @aa1.5
   Scenario: Loan Account redirected
     Given User enter the valid username and password
     When the user click "Loan" link on the Account Summary page
     Then the "Account Activity" page should be displayed
     And Account drop down should have "Loan" selected

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
