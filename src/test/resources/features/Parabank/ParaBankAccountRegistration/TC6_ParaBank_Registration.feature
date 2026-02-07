Feature: TC6_Registration Form Test

  @web @TC6_PARABANK_Registration
  Scenario Outline: Successful User Registration
    Given User login to the para bank page
    Then User input username '<Username>'
    And User input password '<Password>'
    And User Click on the Login button
    Then User validate invalid user login
    And User Click on the Registration button
    Then User sign up for ParaBank Account
      | TC-6-Register-Firstname  |
      | TC-6-Register-Lastname   |
      | TC-6-Register-Address    |
      | TC-6-Register-City       |
      | TC-6-Register-State      |
      | TC-6-Register-ZipCode    |
      | TC-6-Register-Phone      |
      | TC-6-Register-SSN        |
    And User enter account username '<AccountUsername>'
    And User enter account password '<AccountPassword>'
    And User enter account Confirm password '<AccountConfirmPassword>'
    Then User Click on the register button
    And User Verify the account username
    Then User Click on the Log Out button

    Examples:
      | Username      | Password       |  AccountUsername        |  AccountPassword         | AccountConfirmPassword        |
      | TC-6-UserName | TC-6-Password  |  TC-6-Account-Username  |  TC-6-Account-Password   | TC-6-Account-ConfirmPassword  |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script
