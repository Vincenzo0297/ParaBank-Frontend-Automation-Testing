Feature: TC5_Registration Form Test

  @web @TC5_PARABANK_Registration
  Scenario Outline: Successful User Registration
    Given User login to the para bank page
    Then User input username '<Username>'
    And User input password '<Password>'
    And User Click on the Login button
    Then User validate invalid user login
    And User Click on the Registration button
    Then User sign up for ParaBank Account
      | TC-5-Register-Firstname  |
      | TC-5-Register-Lastname   |
      | TC-5-Register-Address    |
      | TC-5-Register-City       |
      | TC-5-Register-State      |
      | TC-5-Register-ZipCode    |
      | TC-5-Register-Phone      |
      | TC-5-Register-SSN        |
    And User enter account username '<AccountUsername>'
    And User enter account password '<AccountPassword>'
    And User enter account Confirm password '<AccountConfirmPassword>'
    Then User Click on the register button
    And User Verify the account username
    Then User Click on the Log Out button

    Examples:
      | Username      | Password       |  AccountUsername        |  AccountPassword         | AccountConfirmPassword        |
      | TC-5-UserName | TC-5-Password  |  TC-5-Account-Username  |  TC-5-Account-Password   | TC-5-Account-ConfirmPassword  |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script
