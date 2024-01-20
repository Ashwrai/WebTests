# Created by Carolina at 03/01/2024
Feature: Sidebar
  # Enter feature description here

  Scenario: Category
    Given the user enters the webpage
    When the user clicks on a specific category
    Then the page display the subcategories from the selected category
    When the user clicks on a specific subcategory
    Then the page updates showing the specific query

  Scenario: Brands
    Given the user enters the webpage
    When the user clicks on a specific brand
    Then the page updates to display products from the selected brand

