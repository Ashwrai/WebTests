# Created by Carolina at 03/01/2024
Feature: Scroll-To-Top Button
  # This feature focuses on the implementation of a scroll-to-top button, addressing scenarios such as the appearance,
  # hiding, and functionality of the button.

  Scenario: Button Appears
    Given the user enters the webpage
    When the user scrolls down
    And wait '1000'
    And the scroll-to-top button becomes visible

  Scenario: Button Hides
    Given the user enters the webpage
    When the user scrolls down
    And wait '1000'
    Then the user scrolls up
    And wait '1000'
    And the scroll-to-top button hides

  Scenario: Button Scrolls To The Top
    Given the user enters the webpage
    When the user scrolls down
    And wait '1000'
    Then the user clicks the scroll-to-top button
    And wait '1000'
    And the user is at the top

