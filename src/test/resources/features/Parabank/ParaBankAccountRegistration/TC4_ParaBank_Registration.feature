Feature: TC4_Registration Form Test

  @web @TC4_PARABANK_Registration
  Scenario Outline: Successful User Registration
    Given User login to the para bank page
    Then User input username '<Username>'
    And User input password '<Password>'
    And User Click on the Login button
    Then User validate invalid user login
    And User Click on the Registration button
    Then User sign up for ParaBank Account
      | TC-4-Register-Firstname  |
      | TC-4-Register-Lastname   |
      | TC-4-Register-Address    |
      | TC-4-Register-City       |
      | TC-4-Register-State      |
      | TC-4-Register-ZipCode    |
      | TC-4-Register-Phone      |
      | TC-4-Register-SSN        |
    And User enter account username '<AccountUsername>'
    And User enter account password '<AccountPassword>'
    And User enter account Confirm password '<AccountConfirmPassword>'
    Then User Click on the register button
    And User Verify the account username
    Then User Click on the Log Out button

    Examples:
      | Username      | Password       |  AccountUsername        |  AccountPassword         | AccountConfirmPassword        |
      | TC-4-UserName | TC-4-Password  |  TC-4-Account-Username  |  TC-4-Account-Password   | TC-4-Account-ConfirmPassword  |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script
