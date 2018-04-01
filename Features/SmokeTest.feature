Feature: Smoke Test for Trustnetdirect Application

  Scenario: Able to login TrustnetDirect as a Full Registered user
    Given Open the TrustnetDirect <URL>
    And Enter the Valid <Username> <Password>
    When Click Login button
    Then User able to successfully logged in

    Examples:
    | URL                           |
    |http://www.trustnetdirect.com  |
  Scenario: Able to login TrustnetDirect as a Full Registered user
    Given Open the TrustnetDirect <URL>
    And Enter the Valid <Username> <Password>
    When Click Login button
    Then User able to successfully logged in