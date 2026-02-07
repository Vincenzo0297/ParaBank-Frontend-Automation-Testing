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
      | TC-2-Register-Firstname  |
      | TC-2-Register-Lastname   |
      | TC-2-Register-Address    |
      | TC-2-Register-City       |
      | TC-2-Register-State      |
      | TC-2-Register-ZipCode    |
      | TC-2-Register-Phone      |
      | TC-2-Register-SSN        |
    And User enter account username '<AccountUsername>'
    And User enter account password '<AccountPassword>'
    And User enter account Confirm password '<AccountConfirmPassword>'
    Then User Click on the register button
    And User Verify the account username
    Then User Click on the Log Out button

    Examples:
      | Username      | Password       |  AccountUsername        |  AccountPassword         | AccountConfirmPassword        |
      | TC-2-UserName | TC-2-Password  |  TC-2-Account-Username  |  TC-2-Account-Password   | TC-2-Account-ConfirmPassword  |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script
