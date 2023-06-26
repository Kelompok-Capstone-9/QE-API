Feature: POST - Craete Membership


  Scenario: As a admin i want to create Membership with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create Membership endpoint
    And user send POST HTTP request with valid endpoint for create Membership
    Then user received POST HTTP responses code 201 for createMembership

  Scenario: As a admin i want to createMembership with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set invalid POST create Membership endpoint
    And user send POST HTTP request with invalid endpoint for create Membership
    Then user received POST HTTP responses code 404 for create Membership

  Scenario: As a admin i want to create Membership with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create Membership endpoint
    And user send POST HTTP request with invalid method for create Membership
    Then user received POST HTTP responses code 404 for create Membership

  Scenario: As a admin i want to create Membership with empty request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create Membership endpoint
    And user send POST HTTP request with empty request body for create Membership
    Then user received POST HTTP response code 400 for create Membership

  Scenario: As a admin i want to create Membership with invalid request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create Membership endpoint
    And user send POST HTTP request with invalid request body for create Membership
    Then user received POST HTTP response code 400 for create Membership

  Scenario: As a admin i want to create Membership with empty token
    Given user set valid POST create Membership endpoint
    When user send POST HTTP request with invalid request body for create Membership
    Then user received valid POST HTTP response code 400 for create Membership

  Scenario: As a user i want to create Membership with valid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid POST create Membership endpoint
    And user send POST HTTP request with invalid request body for create Membership User
    Then user received valid POST HTTP response code 400 for create Membership
