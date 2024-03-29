# Created by Carolina at 02/01/2024
Feature: Products
  # A feature for managing and interacting with products on the webpage. Users can search for products, add them to
  # the cart, and view detailed product information.

  Scenario: Search Product
    Given the user is on the products page
    When the user enters a search query in the search bar
    Then the user clicks on the search button
    And wait '1000'
    And the search results for the entered query are displayed

  Scenario: Add Product To Cart
    Given the user is on the products page
    When the user adds a product
    And wait '1000'
    And the user clicks view cart button
    And the user is redirected to the cart button page
    And the product added is shown

  Scenario: View Product
    Given the user is on the products page
    When the user clicks on View Product a product
    And wait '1000'
    Then the user is redirected to the product info page