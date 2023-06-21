Feature: POST - Craete Plan

  Scenario: As a admin i want to create plan with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create plan endpoint
    And user send POST HTTP request with valid endpoint for create plan
    Then user received POST HTTP response code 201 for create plan

  Scenario: As a admin i want to create plan with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set invalid POST create plan endpoint
    And user send POST HTTP request with invalid endpoint for create plan
    Then user received POST HTTP responses code 404 for create plan

  Scenario: As a admin i want to create plan with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create plan endpoint
    And user send POST HTTP request with invalid method for create plan
    Then user received POST HTTP responses code 404 for create plan

  Scenario: As a admin i want to create plan with empty request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create plan endpoint
    And user send POST HTTP request with empty request body for create plan
    Then user received POST HTTP response code 201 for create plan

  Scenario: As a admin i want to create plan with invalid request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create plan endpoint
    And user send POST HTTP request with invalid request body for create plan
    Then user received POST HTTP response code 201 for create plan

  Scenario: As a admin i want to create plan with empty token
    Given user set valid POST create plan endpoint
    When user send POST HTTP request with invalid request body for create plan
    Then user received valid POST HTTP response code 400 for create plan

  Scenario: As a user i want to create plan with valid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid POST create plan endpoint
    And user send POST HTTP request with invalid request body for create plan
    Then user received valid POST HTTP response code 400 for create plan


