# Created by Carolina at 03/01/2024
Feature: Cart
# This feature focuses on the functionality of the shopping cart on the website. The scenarios covered include an empty
# cart, the removal of products from the cart, and the process of completing the purchase with or without being logged in.
  Scenario: Empty Cart
    Given the user is on the cart page
    When the cart is empty
    And the user clicks on here link
    And the user is redirected to the products page

  Scenario: Remove Product From The Cart
    Given the user enters the webpage
    When the user adds a product
    And wait '1000'
    And the user clicks view cart button
    And the user is redirected to the cart button page
    And the product added is shown
    When the user clicks the delete button
    And wait '1000'
    Then the cart is empty

  Scenario: Checkout without having logged in
    Given the user enters the webpage
    When the user adds a product
    And wait '1000'
    And the user clicks view cart button
    And the user is redirected to the cart button page
    When the user proceeds to checkout
    Then the checkout popup screen appears
    When the user clicks on Register Login option
    And wait '1000'
    Then the user is on signup login page

  Scenario: Checkout without having logged in Continue On Cart
    Given the user enters the webpage
    When the user adds a product
    And wait '1000'
    And the user clicks view cart button
    And the user is redirected to the cart button page
    Then the user proceeds to checkout
    And wait '1000'
    And the checkout popup screen appears
    And the user clicks on Continue On Cart button
    And wait '1000'
    Then the popup closes
    And the user continues on Cart page

  Scenario: Checkout with the user identified
    Given the user enters the webpage
    When the user logs in
    And the user adds a product
    And wait '1000'
    And the user clicks view cart button
    And the user is redirected to the cart button page
    Then the user proceeds to checkout
    And wait '1000'
    And the user is in checkout page