Feature: user is able to select travelers from travelers selector


  Scenario: User should be able to increment traveler count up to 9
    Given click on the travelers selector
    Then click on adults plus button twenty times
    And verify travelers selector input value is nine

  Scenario: Minimum one traveler should be selected
    Given click on the travelers selector
    Then click on adults minus button five times
    Then verify adults travelers input value is one
#    test cases is running once after that it doesn't work bcz of wait issue

  Scenario: User can select one traveler from every single passenger type
    Given click on the travelers selector
    Then click on plus button of every traveler option
    And verify every travelers input fields value are not zero
#    test cases is running once after that it doesn't work bcz of wait issue

  Scenario: User can only travel with one pet
    Given click on the travelers selector
    And click on the travel with pet button
    Then verify user is only able to travel with one pet
      #    test cases is running once after that it doesn't work bcz of wait issue
