# Created by Carolina at 03/01/2024
Feature: Subscription
  # Feature for managing user subscriptions to receive updates, newsletters, or other periodic content. Includes
  # scenarios for successful subscription and handling invalid email addresses.

  Scenario: Subscription successfull
    Given the user enters the webpage
    When the user scrolls to the bottom
    And the user enters email in the email input of the Subscription section
    And the user clicks on submit button
    Then the successful message shows up

  Scenario: Invalid email address
    Given the user enters the webpage
    When the user scrolls to the bottom
    And the user enters an invalid email in the email input of the Subscription section
    And the user clicks on submit button
    Then nothing shows up