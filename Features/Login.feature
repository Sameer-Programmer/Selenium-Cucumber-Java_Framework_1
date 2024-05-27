Feature: Login Feature
  Scenario: Login with Valid Crediantials
    Given Launch the Chrome Browser
    When Enter the URL "https://admin-demo.nopcommerce.com/login"
    And User Enters Email as "admin@yourstore.com" and password as "admin" Click on Login
    Then Page Title Should be ""
    Then Logout
    Then close the Browser

