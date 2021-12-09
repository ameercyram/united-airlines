Feature:


  Scenario: Choosing the one way flight option should only have a return date field
    Given click on one way radio button
    Then verify there is only departure input field display on the travel section

  Scenario: Choosing round trip option should have departing and return date fields
    Given click on roundTrip radio button
    Then verify departure and return date input fields display on the travel section


  Scenario: Leaving from and going to fields should switch when click on switch icon in the middle
    Given fill out leaving and destination field
    And get the value of leaving and destination fields
    Then click on the switch button
    And verify leaving and destination are switched

  Scenario: Leaving from and going to fields should have correct placeholders
    Given verify user is on home page
    Then verify leaving and destination have correct placeholders

  Scenario: User should be able to remove leaving from location value
    Given put some value in the leaving from input field
    Then click on the leaving from cross button
    And verify leaving from field value is removed

  Scenario: User should be able to remove going to location value
    Given put some value in the going to input field
    Then click on the going to cross button
    And verify going to field value is removed

  Scenario: Advance search should open a separate page with more advanced search fields
    Given click on the Advance search button
    Then verify separate page is open
    And verify more advanced fields displayed on the page

  Scenario: Checking flexible dates option should change the Dates field to month dropdown only
    Given click on the Advance search button
    Then verify departure and return date input fields display above the Flexible dates checkbox
    Then click on the Flexible dates checkbox
    And verify Month dropdown display above the Flexible dates checkbox

  Scenario: User can select different flight classes such as Economy, Premium economy, Business or First
    Given click on the different classes from cabinTypes and verify classes are selected


