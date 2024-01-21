# Created by Carolina at 03/01/2024
Feature: Product Details
# This feature focuses on product details, addressing scenarios such as modifying the quantity and adding products
# to the cart.

  Scenario: Add to cart
    Given the user is on the product details page of a specific product
    And the user clicks on add to cart button
    And wait '1000'
    Then the user clicks view cart button
    And wait '1000'
    And the user is redirected to the cart button page
    And the product added is shown

  Scenario: More products
    Given the user is on the product details page of a specific product
    When the user enters the amount in the amount input
    And the user clicks on add to cart button
    And wait '1000'
    Then the user clicks view cart button
    And wait '1000'
    And the user is redirected to the cart button page
    And the amount is added the cart

  Scenario: Continue Shopping
    Given the user is on the product details page of a specific product
    And the user clicks on add to cart button
    And wait '1000'
    Then the user clicks continue shopping button
    And wait '1000'
    And the user stays at the product page
