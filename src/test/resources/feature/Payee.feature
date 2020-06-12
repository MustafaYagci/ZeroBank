Feature: Add new payee under pay bills
  @payee
  Scenario: Add new payee
    Given User enter the valid username and password
    Given User shold able to click "Pay Bills" module
    Given the user click "Add New Payee" link on the Account Summary page
    And creates new payee using following information
    |Payee Name|The Law Offices of Hyde, Price & Scharks|
    |Payee Address|100 Same st, Anytown, USA, 10001|
    |Account|Checking|
    |Payee Details|XYZ account|

    Then message "The new payee The Law Offices of Hyde, Price & Scharks was successfully created." should be displayed.