# Created by Carolina at 03/01/2024
Feature: Sidebar
  # Feature for navigating and exploring various categories and brands on the webpage using the sidebar. Users can click
  # on specific categories to view subcategories and perform queries. Additionally, users can explore products
  # associated with specific brands.

  Scenario: Category
    Given the user enters the webpage
    When the user clicks on a specific category
    Then the page display the subcategories from the selected category
    And wait '1000'
    And the user clicks on a specific subcategory
    Then the page updates showing the specific query

  Scenario: Brands
    Given the user enters the webpage
    When the user clicks on a specific brand
    Then the page updates to display products from the selected brand

