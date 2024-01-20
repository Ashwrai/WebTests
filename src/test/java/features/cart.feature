# Created by Carolina at 03/01/2024
Feature: Cart
# This feature focuses on the functionality of the shopping cart on the website. The scenarios covered include an empty
# cart, the removal of products from the cart, and the process of completing the purchase with or without being logged in.
  Scenario: Empty Cart
    Given the user is on the website with an empty cart
    When the user checks the cart by clicking on the cart option
    Then the cart is empty
    And the page shows 'Cart is empty! Click here to buy products.'
    And the user can click on 'here' to be redirected to the 'Products' section

  Scenario: Remove Product From The Cart
    Given the user is looking his cart
    And the user has products in the cart
    When the user clicks the delete button of a specific product in the cart
    Then the product is removed from the cart

  Scenario: Checkout without having logged in
    Given the user is looking his cart
    And the user has products in the cart
    When the user proceeds to checkout without logging in
    Then the checkout popup screen appears showing 'Register / Login account to proceed on checkout.'
    And the user can click on 'Register/Login' or 'Continue On Cart'
    When the user clicks on 'Register/Login'
    Then the user is redirected to the Signup/Login page
    When the user clicks on 'Continue On Cart'
    Then the popup closes
    And the user continues on 'Cart'

  Scenario: Checkout with the user identified
    Given the user is logged in
    And the user is on his cart with some products
    When the user proceeds to checkout
    Then the checkout process starts showing the address and order details
    And the user can add a comment about his order
    When the user click on 'Place Order' button
    Then the payment process starts



