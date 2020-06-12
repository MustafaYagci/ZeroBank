@currency
Feature: Purchase Foreign Currency
  @currency1
  Scenario: Available currencies
    Given User enter the valid username and password
    Given User shold able to click "Pay Bills" module
    Given the user click "Purchase Foreign Currency" link on the Account Summary page
    Then following currencies should be available
    |Australia (dollar)|
    |Canada (dollar)|
    |Switzerland (franc)|
    |China (yuan)|
    |Denmark (krone)|
    |Eurozone (euro)|
    |Great Britain (pound)|
    |Japan (yen)|
    |Mexico (peso)|
    |Norway (krone)|
    |New Zealand (dollar)|
    |Singapore (dollar)|

  @currency2
  Scenario: Error message for not selecting currency
    Given User enter the valid username and password
    Given User shold able to click "Pay Bills" module
    Given the user click "Purchase Foreign Currency" link on the Account Summary page
    When user tries to calculate cost without selecting a currency
    Then error message should be displayed

  @currency3
  Scenario: Error message for not entering value
    Given User enter the valid username and password
    Given User shold able to click "Pay Bills" module
    Given the user click "Purchase Foreign Currency" link on the Account Summary page
    When user tries to calculate cost without selecting a value
    Then error message should be displayed