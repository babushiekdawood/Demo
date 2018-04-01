Feature: Open the Trustnet and Verify the find a fund section
  @done
  Scenario: Open the Trustnet and verify the find a fund section
    Given Open the Trustnet Website
    And Select the TrustnetUsertype
    When Click the Find a Fund search box
    And Enter the Search "Aberdeen" text and click the search icon
    Then User able to search the enter text


#  Scenario: Open the TrustnetDirect and Enter Username Password
#    Given Open the TrustnetDirect Website
#    When Click the Login button
#    And User able to see the Login Popup
#    Then Enter the "babulive21" and "Fedby123#"
#
#
#  Scenario: Open the TrustnetDirect and verify Login
#    Given Open the TrustnetDirect Website
#    And Click the Login button
#    And User able to see the Login Popup
#    When Enter the "babulive21" and "Fedby123#"
#    And Click the Loginpopup Login button
#    Then User logged in Succesfully "FirstLastname"
#
#
#
#  Scenario Outline: Open the TrustnetDirect and verify different Logins
#    Given Open the TrustnetDirect Website
#    And Click the Login button
#    And User able to see the Login Popup
#    When Enter the "<Username>" and "<Password>"
#    And Click the Loginpopup Login button
#    Then User logged in Succesfully
#    Examples:
#      |Username  | Password   | logged |
#      |babuqa21|  Fedby123# | BABU.. BABU..      |
#      |laurahenn |  Password1 | babu.. babu..      |
