# Created by Carolina at 01/01/2024
Feature: Log in
  # This feature focuses on the web login functionality, allowing users to access their accounts by providing valid
  # credentials. Scenarios include successful login, handling incorrect emails, and managing incorrect passwords.

  Scenario: Successful Log in
    Given the user is in the log in page
    When the user enters email in the email input
    And the user enters password in the password input
    And the user clicks login button
    Then the user accesses his account

  Scenario: Invalid Email
    Given the user is in the log in page
    When the user enters incorrect email in the email input
    And the user enters password in the password input
    And the user clicks log in button
    Then the invalid email or password message appears

  Scenario: Invalid Password
    Given the user is in the log in page
    When the user enters email in the email input
    And the user enters incorrect password in the password input
    And the user clicks log in button
    Then the invalid email or password message appears