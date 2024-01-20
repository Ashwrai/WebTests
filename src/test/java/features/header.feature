# Created by Carolina at 03/01/2024
Feature: Header
  # This feature focuses on the website header. Different scenarios arise based on the user's state and actions taken
  # when clicking various elements in the header.

  Scenario: Header Options If User Hasn't Logged In
    Given the user enters the webpage
    Then the header displays signup login button

  Scenario: Header Options If User Logged In
    Given the user enters the webpage
    And the user logs in
    Then the user is logged in
    And the header shows Logged in as and the name of the user who has logged in

  Scenario: Clicks In Products
    Given the user enters the webpage
    When the user clicks on products in the header
    Then the user is redirected to the products page

  Scenario: Clicks In Cart
    Given the user enters the webpage
    When the user clicks on cart button in the header
    Then the user is redirected to the cart button page

  Scenario: Clicks In Logout
    Given the user enters the webpage
    And the user logs in
    Then the user is logged in
    When the user clicks on logout button in the header
    Then the user is on signup login page

  Scenario: Clicks In Delete Account
    Given the user enters the webpage
    And the alternative user logs in
    Then the user is logged in
    When the user clicks on delete account button in the header
    Then the header displays signup login button

  Scenario: Clicks In Signup/Login
    Given the user enters the webpage
    When the user clicks on signup login button in the header
    Then the user is on signup login page

  Scenario: Clicks In Testcases
    Given the user enters the webpage
    When the user clicks on testcases button in the header
    Then the user is redirected to the testcases button page

  Scenario: Clicks In API Testing
    Given the user enters the webpage
    When the user clicks on API testing button in the header
    Then the user is redirected to the API Testing button page

  Scenario: Clicks In Video Tutorials
    Given the user enters the webpage
    When the user clicks on video tutorials button in the header
    Then the user is redirected to the video tutorials button page

  Scenario: Clicks In Contact Us
    Given the user enters the webpage
    When the user clicks on contact us button in the header
    Then the user is redirected to the contact us button page