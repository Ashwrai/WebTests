# Created by Carolina at 03/01/2024
Feature: Product Details
# This feature focuses on product details, addressing scenarios such as modifying the quantity and adding products
# to the cart.

  Scenario: Modify Quantity
    Given the user is in the product details of a specific product
    When the user hovers over the number of products selected
    Then up and down arrows appear next to the number
    When you click on the up arrow
    Then the quantity increases by 1
    When you click on the down arrow
    Then the quantity decreases by 1

  Scenario: Add To Cart
    Given the user is in the product details of a specific product
    When the user clicks on the 'Add to cart' button
    Then the pop-up shows 'Your product has been added to cart.'
    And the user can click on the 'Continue Shopping' button
    And the user can click on the 'View Cart' button

    When the user clicks on 'Continue Shopping' button
    Then the pop-up closes

    When the user clicks on 'View Cart' button
    Then the user is redirected to the 'Cart' page
