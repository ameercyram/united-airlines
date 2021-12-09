Feature: user is able to select different packages

  Background:
    Given click on the packages tab

  Scenario: User should see vacation search result with all fields filled properly
    And fill out all the fields correctly
    Then click on the find trips button
    And verify user is able to see different search results

  Scenario: Vacation form should have only up to 4 rooms
    Given click on the packages rooms dropdown
    Then verify dropdown display up to four rooms

  Scenario: Rooms container should say “rooms” if room count is bigger than one
    Given click on the packages rooms dropdown
    And click on the two rooms option
    Then verify rooms container display two rooms

  Scenario: Flight and hotel search should display flight and hotel spinning icons on result page
    And fill out all the fields correctly
    Then click on the find trips button
    And verify flight and hotel spinning icon display on the result page
#          did not assert bcz ilzat said skip it

  Scenario: Rooms option dropdown should disappear when Flight and car option is selected
    Given verify rooms dropdown is displayed on hotels and flight option
    Then click on the flight and car radio button
    And verify rooms is not displayed on the tab

  Scenario: Clicking cruise link should navigate to United Cruises page
    Given click on the cruise link
    Then verify user is on United Cruises page
