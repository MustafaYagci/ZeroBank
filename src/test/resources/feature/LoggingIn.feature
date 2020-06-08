
Feature: Login

  Scenario: Login Succesfully
    Given User enter the valid username and password
    When  User should able to login
    Then  Account Summary page should be displayed

    Scenario: Login Invalid Credentials
      Given User enter the invalid username and password
      Then User shold get error message and should be displayed "Login and/or password are wrong."