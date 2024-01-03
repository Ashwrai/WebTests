# Created by dani at 18/12/2023
Feature: Sign up
# This feature focuses on the web registration functionality, allowing users to create an account.
# Scenarios include registration with a valid email, handling repeated emails, successful registration,
# and detecting and handling incomplete registrations.

  Scenario: Valid Email

    Given the user is in the sign up page
    When the user enters name in the name input
    And the user enters email in the email input
    And the user clicks sign up button
    Then the sign up form appears

  Scenario: Invalid Email

    Given the user is in the sign up page
    When the user enters name in the name input
    And the user enters repeated email in the email input
    And the user clicks sign up button
    Then the invalid email message appears

  Scenario: Successful Sign Up

    Given the user is in the sign up page
    When the user enters name in the name input
    And the user enters email in the email input
    And the user clicks sign up button
    Then the sign up form appears
    When the user selects title
    And the user enters password in the password input
    And the user enters First name in the First name input
    And the user enters Last name in the Last name input
    And the user enters Address in the Address input
    And the user selects Country
    And the user enters State in the State input
    And the user enters City in the City input
    And the user enters Zipcode in the Zipcode input
    And the user enters Mobile Number in the Mobile Number input
    And the user clicks sign up button
    Then the user account is created

  Scenario: Incomplete Sign Up

    Given the user is in the sign up page
    When the user enters name in the name input
    And the user enters email in the email input
    And the user clicks sign up button
    Then the sign up form appears
    When the user clicks sign up button
    Then the error message 'Fill out this field.' appears