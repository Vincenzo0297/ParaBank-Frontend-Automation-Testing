Feature: TC1_Registration Form Test

  @web @TC1_PARABANK_Registration
  Scenario Outline: Successful User Registration
    Given User login to the para bank page
    #Then User input username '<Username>'
    #And User input password '<Password>'
    And User Click on the Login button
    #Then User validate invalid user login
    And User Click on the Registration button
    Then User sign up for ParaBank Account
      | TC-1-Register-Firstname  |
      | TC-1-Register-Lastname   |
      | TC-1-Register-Address    |
      | TC-1-Register-City       |
      | TC-1-Register-State      |
      | TC-1-Register-ZipCode    |
      | TC-1-Register-Phone      |
      | TC-1-Register-SSN        |
    And User enter account username '<AccountUsername>'
    And User enter account password '<AccountPassword>'
    And User enter account Confirm password '<AccountConfirmPassword>'
    #Then User Click on the register button
    #And User Verify the account username
    #Then User Click on the Log Out button

    Examples:
      | Username      | Password       |  AccountUsername        |  AccountPassword         | AccountConfirmPassword        |
      | TC-1-UserName | TC-1-Password  |  TC-1-Account-Username  |  TC-1-Account-Password   | TC-1-Account-ConfirmPassword  |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script
