# Created by Carolina at 03/01/2024
Feature: Header
  # This feature focuses on the website header. Different scenarios arise based on the user's state and actions taken
  # when clicking various elements in the header.

  Scenario: Header Options If User Hasn't Logged In
    Given the user enters the webpage
    And the user hasn't logged in
    When the home page loads
    Then the header displays 'Home', 'Products', 'Cart', 'Signup/Login', 'Test Cases', 'API Testing', 'Video Tutorials', 'Contact Us'

  Scenario: Header Options If User Logged In
    Given the user is in the webpage
    And the user has logged in
    When the home page loads
    Then the header displays 'Home', 'Products', 'Cart', 'Logout, 'Delete Account','Test Cases', 'API Testing', 'Video Tutorials', 'Contact Us'
    And the header shows 'Logged in as' and the name of the user who has logged in

  Scenario: Clicks In Products
    Given the user is on any page of the website
    When the user clicks on 'Products' in the header
    Then the user is redirected to the 'Products' page

  Scenario: Clicks In Cart
    Given the user is on any page
    When the user clicks on 'Cart' in the header
    Then the user is redirected to the 'Cart' page

  Scenario: Clicks In Logout
    Given the user is on any page
    And the user is logged in
    When the user clicks on 'Logout' in the header
    Then the user is logged out and redirected to the home page

  Scenario: Clicks In Delete Account
    Given the user is on any page
    And the user is logged in
    When the user clicks on 'Delete Account' in the header
    Then the user is prompted to confirm the deletion of the account

  Scenario: Clicks In Signup/Login
    Given the user is on any page
    And the user hasn't logged in
    When the user clicks on 'Signup/Login' in the header
    Then the user is redirected to the 'Signup/Login' page

  Scenario: Clicks In Testcases
    Given the user is on any page
    When the user clicks on 'Testcases' in the header
    Then the user is redirected to the 'Testcases' page

  Scenario: Clicks In API Testing
    Given the user is on any page
    When the user clicks on 'API Testing' in the header
    Then the user is redirected to the 'API Testing' page

  Scenario: Clicks In Video Tutorials
    Given the user is on any page
    When the user clicks on 'Video Tutorials' in the header
    Then the user is redirected to the 'Video Tutorials' page

  Scenario: Clicks In Contact Us
    Given the user is on any page
    When the user clicks on 'Contact Us' in the header
    Then the user is redirected to the 'Contact Us' page