Feature: TC2_Registration Form Test

  @web @TC2_PARABANK_Registration
  Scenario Outline: Successful User Registration
    Given User login to the para bank page
    Then User input username '<Username>'
    And User input password '<Password>'
    And User Click on the Login button
    Then User validate invalid user login
    And User Click on the Registration button
    Then User sign up for ParaBank Account
      | Jason           |
      | Joe             |
      | New York ave 1  |
      | Helloworld      |
      | California      |
      | 1234567         |
      | 8765432123      |
      | 437-02-2223     |
    And User enter account username '<AccountUsername>'
    And User enter account password '<AccountPassword>'
    And User enter account Confirm password '<AccountConfirmPassword>'

    Examples:
      | Username | Password  | AccountUsername  | AccountPassword | AccountConfirmPassword |
      | Admin    | admin123  |  Donald Trump    |  User01         |      User01            |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script