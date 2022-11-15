@smoke
Feature: user should be register to application
  Scenario: user can register
    Given user open Register Link
  When user enter personal data
  And user click on Register button
    Then a successfull message appear

