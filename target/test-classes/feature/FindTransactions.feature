@transaction
Feature: Find transactions in Account Activity
  Scenario: Search date range
    Given User enter the valid username and password
    When user acess the Find Transaction tab
    Given the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks search
    Then results table should only show transaction dates between "2012-09-01" to "2012-09-06"
    And the results should be sorted by most recent date
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And clicks search
    Then results table should only show transaction dates between "2012-09-02" to "2012-09-06"
    And the results table should only not contain transactions date "2012-09-01"

@serchDiscription
  Scenario: Search description
    Given User enter the valid username and password
    Given user acess the Find Transaction tab
    When User enter description "ONLINE"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"
    When User enter description "OFFICE"
    And clicks search
    Then results table should only show descriptions containing "OFFICE"
    Given User enter description "online"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"

  @Type
  Scenario: Type
    Given User enter the valid username and password
    Given user acess the Find Transaction tab
    And clicks search
    Then results table should show at least one result under "Deposit"
    Then results table should show at least one result under "Withdrawal"
    When user select type "Deposit"
    And clicks search
    Then results table should show at least one result under "Deposit"
    But results table should show no  result under "Withdrawal"
    When user select type "Withdrawal"
    And clicks search
    Then results table should show at least one result under "Withdrawal"
    But results table should show no  result under "Deposit"
