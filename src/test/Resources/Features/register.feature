@register
Feature: login
  Scenario: user should able to register successfully
    Given user is on register page
    When user fill all the mandatory fields
    Then user should able to register successfully