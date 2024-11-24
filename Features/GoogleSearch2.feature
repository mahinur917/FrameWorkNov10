Feature: google search
  I want to use this template for my feature file

  Scenario Outline: simple search
    Given i am on the google homepage
    When i enter search "<term>"
    And i click on google search button
    Then i receive related search result

    Examples: 
      | term              |
      | Quality Assurance |
      | Software testing  |
