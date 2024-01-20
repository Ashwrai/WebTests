# Created by Carolina at 03/01/2024
Feature: Scroll-To-Top Button
  # This feature focuses on the implementation of a scroll-to-top button, addressing scenarios such as the appearance,
  # hiding, and functionality of the button.

  Scenario: Button Appears
    Given the user enters the webpage
    When the user starts scrolling down
    And reaches a specific scroll position
    Then the scroll-to-top button becomes visible

  Scenario: Button Hides
    Given the user enters the webpage
    Given the user is not at the top of the webpage
    When the user scrolls up to the top of the webpage
    Then the scroll-to-top button hides

  Scenario: Button Scrolls To The Top
    Given the user is on bottom of the webpage
    When the user clicks the scroll-to-top button
    Then the webpage scrolls to the top

