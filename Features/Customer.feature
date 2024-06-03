Feature: Login Feature
  Scenario: Login with Valid Crediantials
    Given Launch the Chrome Browser
    When Enter the URL "https://admin-demo.nopcommerce.com/login"
    And User Enters Email as "admin@yourstore.com" and password as "admin" Click on Login
    Then Page Title Should be "Dashboard/nopCommerce administration"
    Then Click on Customer menu
    Then Click on Customers menu tab
    Then Click on Customers sub tab
    Then Page Title Should be "Customers / nopCommerce administration"
    Then Click on Add new button
    Then Page Title Should be "Add a new Customer / nopCommerce administration"
    Then Enter Customers info
    Then Click on Save button
    Then Logout
    Then close the Browser