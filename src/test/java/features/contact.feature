# Created by Carolina at 03/01/2024
Feature: Contact
# This feature focuses on the contact section of the website. The scenarios covered include empty form fields,
# successful submission of the contact form, the use of the home button on the contact page, and validation
# of email addresses.

  Scenario: Form Field Empty
    Given the user is in the contact page
    When the user attempts to submit the contact form with empty fields
    Then an error message is displayed indicating the need to fill out the empty field

  Scenario: Successfull Feedback Form
    Given the user is in the contact page
    When the user enters email in the email input
    And the user clicks submit button
    Then the confirmation pop up appears showing 'Press OK to proceed!'
    When the user clicks on 'OK'
    Then the message 'Success! Your details have been submitted successfully.' appears
    And the home button shows

  Scenario: Home Button In Contacts Us Page
    Given the user is in contact page
    And the user has senden the contact form successfully
    When the user clicks on 'home' button
    Then the user is redirected to the home screen

  Scenario: Invalid email address
    Given the user is in the contact page
    When the user enters an invalid email in the email input
    And the user clicks submit button
    Then the invalid email message appears