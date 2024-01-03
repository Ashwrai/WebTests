# Created by Carolina at 01/01/2024
Feature: Home page
  # This feature focuses on the home page. The scenarios covered include the automatic image slider, manual control of
  # the slider, and interaction with featured items.

  Scenario: Automatic Image Slider
    Given the user is on the home page
    When the page loads
    Then the images in the slider start sliding automatically
    When the user hovers over the slider
    Then the slider stops the automatic sliding
    And the user can navigate to the next image using the slider controls

  Scenario: Manually Image Slider Controls
    Given the user is on the home page
    And the user interacted with the slider
    When the user navigates to the last image manually
    And the user stops interacting with the slider
    Then resumes automatic sliding after a brief pause
    And the slider wraps around to the first image

    When the user clicks on a specific navigation control
    Then the slider displays the corresponding image
    And the automatic sliding pauses

    When the user stops interacting with the slider
    Then resumes automatic sliding after a brief pause

  Scenario: Features Items
    Given the user is on the home page
    When the user hovers over a product
    Then the product image is covered by an orange window that shows the product details
    And the user can click on the 'Add to cart' button

    When the user clicks on the 'Add to cart' button
    Then the pop up shows 'Your product has been added to cart.'
    And the user can click on 'Continue Shopping' button
    And the user can click on 'View Cart' button

    When the user clicks on 'Continue Shopping' button
    Then the pop up closes

    When the user clicks on 'View Cart' button
    Then the user is redirected to 'Cart' page

    When the user clicks on 'View Product' button of a specific product
    Then the user is redirected to the product info page