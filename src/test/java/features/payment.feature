# Created by Carolina at 03/01/2024
Feature: Payment
# This feature focuses on the cart payment addressing scenarios such as order confirmation, validation of empty payment
# fields, and downloading invoices.


  Scenario: Order confirmed
    Given the user enters the webpage
    When the user logs in
    And the user adds a product
    And wait '1000'
    And the user clicks view cart button
    And the user is redirected to the cart button page
    Then the user proceeds to checkout
    And wait '1000'
    And the user is in checkout page
    And the user puts instructions in instructions input
    Then the user clicks on Place Order button
    And wait '1000'
    And the user is at payment details page
    And the user puts card details
    And the user clicks on Pay and Confirm Order button
    And wait '2000'
    Then the user is at order placed page
    And  the user clicks continue button
    And the user is redirected to the home page

  Scenario: Payment field empty
    Given the user enters the webpage
    When the user logs in
    And the user adds a product
    And wait '1000'
    And the user clicks view cart button
    And the user is redirected to the cart button page
    Then the user proceeds to checkout
    And wait '1000'
    And the user is in checkout page
    And the user puts instructions in instructions input
    Then the user clicks on Place Order button
    And wait '1000'
    And the user clicks on Pay and Confirm Order button
    And wait '2000'
    And the user is at payment details page
