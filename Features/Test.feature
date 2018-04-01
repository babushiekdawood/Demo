Feature: Smoke Test for

  Scenario Outline: Able to login TrustnetDirect as a Full Registered user everu
    Given Open the TrustnetDirects "<URL>"
    And Enter the Valid "<Username>" "<Password>"
    When Click Login button
    Then User able to successfully logged in to Trustnetdirect

Examples:
   | URL                            | | Username   | | Password  |
   | https://www.trustnetdirect.com | | babulive21 | | Fedby123# |
