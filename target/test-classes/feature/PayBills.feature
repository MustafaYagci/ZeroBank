@pb
Feature: Pay Bills
  Scenario: Pay Bills
    Given User enter the valid username and password
    When User shold able to click "Pay Bills" module
    And account summary page should have the title "Zero - Pay Bills"
    And When user successful Pay operation, "The payment was successfully submitted." should displayed.
    Then When user tries to make a payment without entering the amount or date, "Please fill out this field message!" should be displayed.


