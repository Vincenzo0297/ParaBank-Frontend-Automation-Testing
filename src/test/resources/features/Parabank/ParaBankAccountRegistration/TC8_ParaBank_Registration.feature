Feature: TC8_Registration Form Test

  @web @TC8_PARABANK_Registration
  Scenario Outline: Successful User Registration
    Given User login to the para bank page
    Then User input username '<Username>'
    And User input password '<Password>'
    And User Click on the Login button
    Then User validate invalid user login
    And User Click on the Registration button
    Then User sign up for ParaBank Account
      | TC-8-Register-Firstname  |
      | TC-8-Register-Lastname   |
      | TC-8-Register-Address    |
      | TC-8-Register-City       |
      | TC-8-Register-State      |
      | TC-8-Register-ZipCode    |
      | TC-8-Register-Phone      |
      | TC-8-Register-SSN        |
    And User enter account username '<AccountUsername>'
    And User enter account password '<AccountPassword>'
    And User enter account Confirm password '<AccountConfirmPassword>'
    Then User Click on the register button
    And User Verify the account username
    Then User Click on the Log Out button

    Examples:
      | Username      | Password       |  AccountUsername        |  AccountPassword         | AccountConfirmPassword        |
      | TC-8-UserName | TC-8-Password  |  TC-8-Account-Username  |  TC-8-Account-Password   | TC-8-Account-ConfirmPassword  |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script
