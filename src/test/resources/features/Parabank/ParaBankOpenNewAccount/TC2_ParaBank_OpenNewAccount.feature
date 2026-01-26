Feature: TC2_Open New Account

  @web @TC2_PARABANK_Open_New_Account
  Scenario Outline: Successful Open New User Account
    Given User login to the para bank page
    Then User input username '<Username>'
    And User input password '<Password>'
    And User Click on the Login button
    Then User Navigate to open new account
    And User Select type of account '<AccountType>'
    And User Select existing account to transfer funds into the new account '<NewAccountNumber>'
    Then User Click on the open new account button
    Then User Click on the Log Out button

    Examples:
      | Username      | Password | AccountType | NewAccountNumber |
      | Donald Trump  |  User01  |  SAVING     | 13788            |


