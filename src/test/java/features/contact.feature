# Created by Carolina at 03/01/2024
Feature: Contact
# This feature focuses on the contact section of the website. The scenarios covered include empty form fields,
# successful submission of the contact form, the use of the home button on the contact page, and validation
# of email addresses.

  Scenario: Successfull Feedback Form
    Given the user is in the contact page
    When the user enters valid email in the email input
    And the user enters subject in subject input
    And the user enters message in message input
    And the user clicks submit button
    Then the user clicks OK
    And the message is sent
    And the user clicks the home button
    Then the user is redirected to the home page

  Scenario: Invalid email address
    Given the user is in the contact page
    When the user enters an invalid email in the email input
    And the user enters subject in subject input
    And the user enters message in message input
    And the user clicks submit button
    Then nothing is sent