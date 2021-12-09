Feature: user is able to check flight status

  Background:
    Given click on the flight status tab

  Scenario: User searches flight status between from and to destinations
    Then click on the leaving from input field and enter location
    And click on the going to input field and enter location
    Then click on the search button
    And verify user is able to see result on different page

  Scenario: Flight number field should not accept other than numbers
    And enter characters in the flight number field
    Then click on the search button
    Then verify flight number field does not accept characters

  Scenario: Invalid number error message should be displayed when a wrong flight number is entered
    And enter random number in the flight number field
    Then click on the search button
    And verify user should see invalid flight number message
