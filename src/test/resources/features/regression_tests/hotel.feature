Feature: user is able to see different hotels options


  Background:
    Given click on the Hotel tab

  Scenario: Panel should have following fields: Going to, check-in, check-out, number of rooms, number of travelers,book with miles and find hotels button
    And verify hotel tab has all the related fields

  Scenario: One room and 1 travelers should be selected by default
    And verify one traveler and one room is selected by default

  Scenario: User can select maximum 8 adult and 8 children travelers, 16 in total
    And click on the travelers field
    Then click on each plus buttons of adults and children ten times
    And verify only total sixteen travelers are selected

  Scenario: User should be able to  select maximum 8 rooms
    Then click on the rooms dropdown
    And verify user can only select eight rooms

  Scenario: Number of travelers field should disappear when number of rooms is more than one
    And click on the rooms dropdown
    Then select two rooms
    And verify travelers field is disappeared

  Scenario: User should see result when finding for a hotel with all the form fields filled properly
    And fill out the fields correctly
    Then click on the find hotels button
    And verify user is able to see different results

