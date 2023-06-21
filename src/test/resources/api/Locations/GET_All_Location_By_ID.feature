Feature: GET - All Location By ID


  Scenario: As a admin i want to get All Location by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all Location by ID endpoint
    And admin send GET HTTP request with valid endpoint for all Location by ID
    Then admin received valid GET HTTP response code 200 for all Location by ID

  Scenario: As a admin i want to get Location by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET all Location by ID endpoint
    And admin send GET HTTP request with invalid endpoint for all Location by ID
    Then admin received valid GET HTTP responses code 404 for all Location by ID

  Scenario: As a admin i want to get Location by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all Location by ID endpoint
    And admin send GET HTTP request with invalid method for all Location by ID
    Then admin received valid GET HTTP responses code 405 all Location by ID

  Scenario: As a admin i want to get Location by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID GET all Location by ID endpoint
    And admin send GET HTTP request with invalid ID for all Location by ID
    Then admin received valid GET HTTP response code 200 for all Location by ID
