# Created by Carolina at 01/01/2024
Feature: Home page
  # This feature focuses on the home page. The scenarios covered include the automatic image slider, manual control of
  # the slider, and interaction with featured items.

  Scenario: Automatic Image Slider
    Given the user enters the webpage
    And the slider loads
    Then wait '5000'
    And the slider changes
    And wait '5000'
    And the slider changes again
    And wait '5000'
    And the slider completes rotation

  Scenario: The Image Slider stops
    Given the user enters the webpage
    And the slider loads
    Then the user hovers over the slider
    And wait '6000'
    And the slider is still the same

  Scenario: Manually Image Slider Controls
    Given the user enters the webpage
    And the slider loads
    Then the user clicks next image in the slider
    And wait '1000'
    And the next image appears
    And wait '1000'
    Then the user clicks previous image in the slider
    And wait '1000'
    And the previous image appears

  Scenario: Page load
    Given the user enters the webpage
    When the header loads
    And the slider loads
    And the categories list loads
    And the brands list loads
    And the featured products list loads
    And the recommended products list loads
    And the footer loads