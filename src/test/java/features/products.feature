# Created by Carolina at 02/01/2024
Feature: Products
  # Enter feature description here

  Scenario: Search Product
    Given the user is on the products page
    When the user hasn't introduced a query in the search bar
    Then field shows 'Search Product' in it
    When the user enters a search query in the search bar
    Then the search bar just shows the input typed
    When the user clicks on the search button
    Then the search results for the entered query are displayed
    And the user can click on a product to view its details

  Scenario: All Products
    Given the user is on the products page
    When the user hovers over a product
    Then the product image is covered by an orange window that shows the product details
    And the user can click on the 'Add to cart' button

  Scenario: Add Product To Cart
    Given the user is on the products page
    When the user clicks on the 'Add to cart' button
    Then the pop up shows 'Your product has been added to cart.'
    And the user can click on 'Continue Shopping' button
    And the user can click on 'View Cart' button
    When the user clicks on 'Continue Shopping' button
    Then the pop up closes
    When the user clicks on 'View Cart' button
    Then the user is redirected to 'Cart' page

  Scenario: View Product
    Given the user is on the products page
    When the user clicks on 'View Product' button of a specific product
    Then the user is redirected to the product info page