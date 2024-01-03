# Created by Carolina at 03/01/2024
Feature: Review
# This feature focuses on the product review section, addressing scenarios such as correctly submitting reviews, email
# validation, handling incomplete fields, and changes in input fields.

  Scenario: Successful Review
    Given the user is on the product details page
    And the user goes to the 'Write your review' form
    When the user enters a name in the name input
    And the user enters an email in the email input
    And the user enters a review in the review input
    And the user clicks the submit button
    Then the message 'Thank you for your review' shows for a few seconds
    And after a while, the message disappears, and the fields are cleared

  Scenario: Invalid Email
    Given the user is on the product details page
    And the user goes to the 'Write your review' form
    When the user enters an invalid email in the email input
    And the user clicks the submit button
    Then the invalid email message appears

  Scenario: Uncompleted Field
    Given the user is on the product details page
    And the user goes to the 'Write your review' form
    When the user clicks the submit button
    Then the error message 'Fill out this field.' appears

  Scenario: Field To Write The Name Changes
    Given the user is on the product details page
    And the user goes to the 'Write your review' form
    When the user hasn't entered anything in the name input
    Then the field shows 'Your Name' in it
    When the user enters a name in the input
    Then the input field displays the entered name

  Scenario: Field To Write The Email Changes
    Given the user is on the product details page
    And the user goes to the 'Write your review' form
    When the user hasn't entered anything in the email input
    Then the field shows 'Email Address' in it
    When the user enters an email in the input
    Then the input field displays the entered email

  Scenario: Field To Write The Review Changes
    Given the user is on the product details page
    And the user goes to the 'Write your review' form
    When the user hasn't entered anything in the review input
    Then the field shows 'Add Review Here!' in it
    When the user enters a review in the input
    Then the input field displays the entered review
