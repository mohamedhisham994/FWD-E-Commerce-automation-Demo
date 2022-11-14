@smoke
  Feature:F02_Login | users could use login functionality to use their accounts

    Scenario: user could login with valid email and password
      Given user go to login page
      When user enters valid email & password
      And user click on login button
      Then user is logged in successfully
@regression
      Scenario: user could login with invalid email and password
        Given user go to login page
        When user enters invalid email & password
        And user click on login button
        Then user could not login to the system