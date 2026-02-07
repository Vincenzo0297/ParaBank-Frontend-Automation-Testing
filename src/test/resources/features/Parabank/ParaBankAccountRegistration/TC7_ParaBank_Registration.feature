Feature: TC7_Registration Form Test

  @web @TC7_PARABANK_Registration
  Scenario Outline: Successful User Registration
    Given User login to the para bank page
    Then User input username '<Username>'
    And User input password '<Password>'
    And User Click on the Login button
    Then User validate invalid user login
    And User Click on the Registration button
    Then User sign up for ParaBank Account
      | TC-7-Register-Firstname  |
      | TC-7-Register-Lastname   |
      | TC-7-Register-Address    |
      | TC-7-Register-City       |
      | TC-7-Register-State      |
      | TC-7-Register-ZipCode    |
      | TC-7-Register-Phone      |
      | TC-7-Register-SSN        |
    And User enter account username '<AccountUsername>'
    And User enter account password '<AccountPassword>'
    And User enter account Confirm password '<AccountConfirmPassword>'
    Then User Click on the register button
    And User Verify the account username
    Then User Click on the Log Out button

    Examples:
      | Username      | Password       |  AccountUsername        |  AccountPassword         | AccountConfirmPassword        |
      | TC-7-UserName | TC-7-Password  |  TC-7-Account-Username  |  TC-7-Account-Password   | TC-7-Account-ConfirmPassword  |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script
