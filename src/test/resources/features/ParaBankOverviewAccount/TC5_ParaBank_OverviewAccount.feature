Feature: TC5_Account Overview

  @web @TC5_PARABANK_Account_Overview
  Scenario Outline: Successful User Account Overview
    Given User login to the para bank page
    Then User input username '<Username>'
    And User input password '<Password>'
    And User Click on the Login button
|
    Examples:
      | Username | Password |

    # run in terminal (Command Prompt)
    # mvn clean verify -Dcucumber.filter.tags=@login
    # to execute the bdd script
