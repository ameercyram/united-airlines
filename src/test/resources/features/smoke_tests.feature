Feature:Critical functionalities

  @test
  Scenario: user is able to see tabs :book,flight status,check-in etc
    Given verify all the tabs on the homepage

  Scenario: user is able to see available flights when searched for round trip basic economy ticket
    Given fill out leaving and destination field
    And click find flights  button
    Then verify available flights are displayed

  Scenario: user should able to checkout one way flight of Jan 15,2022
    Given click on one way radio button
    And fill out leaving and destination field
    And select the date
    And click find flights  button
    Then verify available flights are displayed

  Scenario: user is able checks out 3 round trip flight tickets: 2 adults, 1 infant for the date of Feb 15, 2022
    Given fill out leaving and destination field
    And enter departure and return date
    And choose two adults and one infant  travelers
    Then click find flights  button
    Then verify available flights are displayed












