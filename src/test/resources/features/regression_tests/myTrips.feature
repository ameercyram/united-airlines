Feature:user is able to check the functionality of my trips tab


  Background:
    Given click on the My Trips tab

  Scenario: There should be a link to find United Travel Credits page
    Then verify travel credits link is displayed on My Trips tab

  Scenario: Empty My Trips form should show error messages when searched without filling up
    Then click on the My Trips search button
    And verify user is able to see error message

  Scenario:There should be a link to find my trips sign in page
    Then verify sign in link is displayed on the My Trips tab
