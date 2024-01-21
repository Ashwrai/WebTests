# Created by Carolina at 03/01/2024
Feature: Review
# This feature focuses on the product review section, addressing scenarios such as correctly submitting reviews, email
# validation, handling incomplete fields, and changes in input fields.

  Scenario: Successful Review
    Given the user is on the product details page of a specific product
    When the user enters name in the review
    And the user enters email in the review
    And the user enters message in the review
    And the user clicks the submit button
    Then the success message shows up
    And wait '3000'
    And the message disappears

  Scenario: Invalid Email
    Given the user is on the product details page of a specific product
    When the user enters name in the review
    And the user enters invalid email in the review
    And the user enters message in the review
    Then the user clicks the submit button
    And wait '1000'
    And nothing happens

  Scenario: Uncompleted Name Field
    Given the user is on the product details page of a specific product
    When the user enters email in the review
    And the user enters message in the review
    Then the user clicks the submit button
    And wait '1000'
    And nothing happens

  Scenario: Uncompleted Email Field
    Given the user is on the product details page of a specific product
    When the user enters name in the review
    And the user enters message in the review
    Then the user clicks the submit button
    And wait '1000'
    And nothing happens

  Scenario: Uncompleted Message Field
    Given the user is on the product details page of a specific product
    When the user enters email in the review
    And the user enters message in the review
    Then the user clicks the submit button
    And wait '1000'
    And nothing happens


