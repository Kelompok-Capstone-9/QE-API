Feature: DELETE - Location By ID

  Scenario: As a admin i want to delete Location by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE Location by ID endpoint
    And admin send DELETE HTTP request with valid endpoint for Location by ID
    Then admin received valid DELETE HTTP response code 200 for Location by ID

  Scenario: As a admin i want to delete Location by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid DELETE Location by ID endpoint
    And admin send DELETE HTTP request with invalid endpoint for Location by ID
    Then admin received valid DELETE HTTP responses code 404 for Location by ID

  Scenario: As a admin i want to delete Location by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE Location by ID endpoint
    And admin send DELETE HTTP request with invalid method for Location by ID
    Then admin received valid DELETE HTTP responses code 404 for Location by ID

  Scenario: As a admin i want to delete Location by ID without token
    Given admin set valid DELETE plan by ID endpoint
    When admin send DELETE HTTP request with valid endpoint for Location by ID
    Then admin received valid DELETE HTTP response code 400 Bad Request for Location by ID

  Scenario: As a admin i want to delete Location by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID DELETE Location by ID endpoint
    And admin send DELETE HTTP request with invalid ID for Location by ID
    Then admin received valid DELETE HTTP response code 200 for Location by ID

  Scenario: As a user i want to delete Location by ID
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid DELETE Location by ID endpoint
    And user send DELETE HTTP request for Location by ID
    Then admin received valid DELETE HTTP response code 400 Bad Request for Location by ID