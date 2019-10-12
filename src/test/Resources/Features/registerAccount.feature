Feature: As a user I want to register my account

  Scenario: User should able to register an account after filling all compulsory fields

    Given User is on homepage
    When User click on Register
    And fill First name
    And fill Last name
    And fill Email
    And enter Password
    And enter Confirm Password
    And click on REGISTER
    Then user account should be register and successful message "Your registration completed" should appear