Feature: RCBMatch

  Scenario: Identify 4 Foreign Players
    Given User has the json file for RCB Team
    When User reads the team details
    Then User should identify the four foreign players in the team

  Scenario: Identify wicket keeper presence
    Given User has the json file for RCB Team
    When User reads the team details
    Then User should identify the availablity wicket player in the team