# Created by Carolina at 03/01/2024
Feature: Subscription
  # Enter feature description here

  Scenario: Subscription successfull
    Given the user is at the bottom of the page
    When the user enters email in the email input of the Subscription section
    And the user clicks on submit button
    Then the message 'You have been successfully subscribed!' shows for a while

  Scenario: Invalid email address
    Given the user is at the bottom of the page
    When the user enters an invalid email in the email input of the Subscription section
    And the user clicks the submit button
    Then the invalid email message appears