Feature: Auto Quote Testing

  Scenario: Create an auto quote
    Given validate home page title
    And dropdown 'Renters'
    When insert zipcode '11372'
    And click start a quote button
    And validate renters page title
    Then insert address '61 woodside'
    And insert apt number input '3A'
    Then click continue button
