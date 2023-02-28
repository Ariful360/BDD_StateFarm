
Feature: Auto Quote Test
  I want to use this template for my feature file

  @smoke
  Scenario: Create an account
    Given validate home page title
    And insert zipcode '11377'
    When click start a quote
    And click continue01 button
    And insert first name 'Ariful'
    Then insert last name 'Islam'

  @dataDriven @regression
  Scenario Outline: Create an account with <zipcode>
    Given validate home page title
    And insert zipcode <zipcode>
    When click start a quote
    And click continue01 button
    And insert first name <fname>
    Then insert last name <lname>

    Examples: 
      | zipcode  | fname | lname |
      | 11377 |   Ariful   | Islam |
      | 11372 |   Ariful   | Islam |
      | 11373 |   Ariful   | Islam |
