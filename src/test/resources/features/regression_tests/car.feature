Feature: Car tab
  user is able to rent cars

  Background:
    Given click on the car tab

  Scenario: Cars form should have following fields: Pickup location, Drop off location, Pickup time,
  Drop off time, return car to same location, primary driver is 25 or older, book with miles, find cars

    Then verify car tabs have all related fields

  Scenario: Drop off location should disappear if return car to same location checkbox is checked
    And click on the return car to same location checkbox
    Then verify dropOff location is displayed
    And click on the return car to same location checkbox
    Then verify dropOff location is disappeared

  Scenario: Age field should disappear if primary driver is 25 or older checkbox is checked
    And click on the primary driver age is twenty five checkbox
    Then verify age field is is display
    And click on the primary driver age is twenty five checkbox
    Then verify age field is disappeared

  Scenario: Finding a car after filling up the form should navigate to a separate tab
    Then fill out the rental cars form properly
    And click on the find cars button
    And verify user is on other tab with results

  Scenario: Finding a car with book with miles checked should return result with miles only
    Then fill out the rental cars form properly
    And click on the book with miles checkbox
    Then click on the find cars button
    And verify results is shown with miles

  Scenario: Searching for a rental car with an age lesser than 21 should display “Some car rental suppliersdo not rent to young drivers.
  If you are travelling with an older person, it may help to makethem your main driver.”

    Then fill out the rental cars form properly
    And click on the primary driver age is twenty five checkbox
    Then enter eighteen age in the age input field
    And click on the find cars button
    Then verify user is able to see that you cannot rent car message

  Scenario: Searching for a rental car with an age of 21 should not return any search result
    Then fill out the rental cars form properly
    And click on the primary driver age is twenty five checkbox
    Then enter twenty one age in the age input field
    And click on the find cars button
    Then verify user is  not able to find any results

  Scenario: Searching for a rental car with an age bigger than 21 should return search result
    Then fill out the rental cars form properly
    And click on the primary driver age is twenty five checkbox
    Then enter twenty two age in the age input field
    And click on the find cars button
    And verify user is on other tab with results

