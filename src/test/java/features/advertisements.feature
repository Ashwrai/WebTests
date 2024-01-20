# Created by Carolina at 03/01/2024
Feature: Button that shows advertisement
# This feature focuses on the interaction with a button that controls the apparition of an advertisement on the webpage.
# Possible scenarios include the automatic apparition of the advertisement, manual hiding of the advertisement using
# the button, and manual display of the advertisement by pressing the same button.
  Scenario: Advertisement Appears Automatically
    Given the user enters the website
    When the page loads
    Then the advertisement appears automatically
    And the arrow on the button changes to pointing down

  Scenario: Hide Advertisement Pressing The Button
    Given the user is on the page with the advertisement displayed
    When the user clicks the button to hide the advertisement
    Then the advertisement hides
    And the arrow on the button changes to pointing up

  Scenario: Show Advertisement Pressing The Button
    Given the user is on the page with the advertisement hidden
    When the user clicks the button to show the advertisement
    Then the advertisement shows
    And the arrow on the button changes to pointing down