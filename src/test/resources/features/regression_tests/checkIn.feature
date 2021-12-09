Feature: user is able to check in successfully

  Background:
    Given click on the check in tab

  Scenario: Empty flight check-in form should show error messages when searched without filling up
    Then click on the check in search button
    And verify error message is displayed

  Scenario: There should be a check-in details link and navigates to correct page
    Then click on the check in details link
    And verify user is able to see correct page

  Scenario: There should be a check-in with MilesPlus link and navigates to correct page
    Then click on the  check in MilesPlus link
    And verify it navigates to the correct page