Feature: Login Page Testing

  Background: 
    * This is Login page Test

  @login
  Scenario: Create Login Page Test
    When click login button01
    And input user id 'ariful'
    And input user password '1234'
    Then click login button02
