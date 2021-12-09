Feature:


  @demo
  Scenario: user is able to change language
    Given click on the language selector button in the header
    And click on the select language dropdown
    Then select the desirable option from dropdown
    Then click on the change button
    And verify the language is changed successfully
  @demo

  Scenario: Home page booker container tabs should display correct fields
    Given click on the Book tab
    And verify Book tab displays correct fields
    Then click on Flight status tab
    And verify Flight status tab shows correct fields
    Then click on the check in tab
    And verify Checks in tab shows correct fields
    Then click on the My Trips tab
    And verify My Trips shows correct fields
  @demo

  Scenario: Advisory top section should display info with links
    Given verify user is on home page
    Then verify info is displayed with links

  Scenario: Footer links should not be broken
    Given verify user is on home page
    Then verify all footer section links have href attributes


  Scenario: Top header tabs should show correct panels when clicked
    Given click on the header Book tab
    And verify Book tab related links are displayed on the panel
    Then click on header My Trips tab
    And verify My Trips tab related links are displayed on the panel
    Then click on header Travel tab
    And verify Travel tab related links are displayed on the panel
    Then click on the header MileAgePlus tab
    And verify MileAgePlus tab related links are displayed on the panel
    Then click on the header Deals tab
    And verify Deals tab related links are displayed on the panel
    Then click on the header Help tab
    And verify Help tab related links are displayed on the panel





