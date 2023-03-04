Feature: Scenario with Back ground
  to check fan code page

  Background: 
    Given enter the url
    When click on Schedule link
    And Schedule page is open

  Scenario: Check the result
    When click on Result tab
    Then check the result

  Scenario: Check Today match
    When click on Today match
    Then Check Today match

  Scenario: Check upcoming matches
    When click on upcoming matches tab
    Then Check upcoming matches
