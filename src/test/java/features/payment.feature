# Created by Carolina at 03/01/2024
Feature: Payment
# This feature focuses on the cart payment addressing scenarios such as order confirmation, validation of empty payment
# fields, and downloading invoices.


  Scenario: Order confirmed
    Given the user is in the payment page
    When the user enters name in the name on card input
    And the user enters card number in the card number input
    And the user enters CVC in the CVC input
    And the user enters the expiration month (number) in the MM input
    And the user enters expiration year in the YYYY input
    And the user clicks pay and confirm order button
    Then the order is confirmed
    And a confirmation screen is shown to the user
    When the user clicks on 'Continue'
    Then the user is redirected to the home screen

  Scenario: Download Invoice
    Given the user is in the confirmation screen
    When the user clicks on 'Download Invoice'
    Then the invoice downloads in the users computer

  Scenario: Payment field empty
    Given the user is on the payment page
    When the user attempts to submit the payment form with empty fields
    Then an error message is displayed indicating the need to fill out the empty field
