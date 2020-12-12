Feature: Opening post page
  Scenario: Open the first post from week page
    Given DevTo main page is open
    When User click week button
    And User select the first post
    Then User should be able to see post content