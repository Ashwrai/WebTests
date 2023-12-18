# Created by dani at 18/12/2023
Feature: Sign up

  Scenario: Successful Sign Up

    Given the user is in the sign up page
    When the user clicks the name box
    And the user enters name in the box
    And the user clicks the email box
    And the user enters email in the box
    And the user clicks sign up box
    Then the sign up form appears
    When the user selects title
    And the user clicks the password box
    And the user enters password in the box
    And the user clicks the First name box
    And the user enters First name in the box
    And the user clicks the Last name box
    And the user enters Last name in the box
    And the user clicks the Address box
    And the user enters Address in the box
    And the user selects Country
    And the user clicks the State box
    And the user enters State in the box
    And the user clicks the City box
    And the user enters City in the box
    And the user clicks the Zipcode box
    And the user enters Zipcode in the box
    And the user clicks the Mobile Number box
    And the user enters Mobile Number in the box
    And the user clicks sign up box
    Then the user account is created
