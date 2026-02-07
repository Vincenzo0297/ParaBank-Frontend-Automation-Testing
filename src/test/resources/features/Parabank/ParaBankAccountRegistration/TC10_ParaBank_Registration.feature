Feature: TC10_Registration Form Test

  @web @TC10_PARABANK_Registration
  Scenario Outline: Successful User Registration
    Given User login to the para bank page
    Then User input username '<Username>'
    And User input password '<Password>'
    And User Click on the Login button
    Then User validate invalid user login
    And User Click on the Registration button
    Then User sign up for ParaBank Account
      | TC-10-Register-Firstname  |
      | TC-10-Register-Lastname   |
      | TC-10-Register-Address    |
      | TC-10-Register-City       |
      | TC-10-Register-State      |
      | TC-10-Register-ZipCode    |
      | TC-10-Register-Phone      |
      | TC-10-Register-SSN        |
    And User enter account username '<AccountUsername>'
    And User enter account password '<AccountPassword>'
    And User enter account Confirm password '<AccountConfirmPassword>'
    Then User Click on the register button
    And User Verify the account username
    Then User Click on the Log Out button

    Examples:
      | Username       | Password        |  AccountUsername         |  AccountPassword          | AccountConfirmPassword        |
      | TC-10-UserName | TC-10-Password  |  TC-10-Account-Username  |  TC-10-Account-Password   | TC-10-Account-ConfirmPassword  |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script
