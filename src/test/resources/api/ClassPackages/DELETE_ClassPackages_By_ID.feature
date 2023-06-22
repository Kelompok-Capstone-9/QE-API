Feature: DELETE - ClassPackages By ID

  Scenario: As a admin i want to delete ClassPackages by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE ClassPackages by ID endpoint
    And admin send DELETE HTTP request with valid endpoint for ClassPackages by ID
    Then admin received valid DELETE HTTP response code 200 for ClassPackages by ID

  Scenario: As a admin i want to delete ClassPackages by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid DELETE ClassPackages by ID endpoint
    And admin send DELETE HTTP request with invalid endpoint for ClassPackages by ID
    Then admin received valid DELETE HTTP response code 400 Bad Request for ClassPackages by ID

  Scenario: As a admin i want to delete ClassPackages by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE ClassPackages by ID endpoint
    And admin send DELETE HTTP request with invalid method for ClassPackages by ID
    Then admin received valid DELETE HTTP responses code 404 for ClassPackages by ID

  Scenario: As a admin i want to delete ClassPackages by ID without token
    Given admin set valid DELETE ClassPackages by ID endpoint
    When admin send DELETE HTTP request with valid endpoint for ClassPackages by ID
    Then admin received valid DELETE HTTP response code 400 Bad Request for ClassPackages by ID

  Scenario: As a admin i want to delete ClassPackages by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID DELETE ClassPackages by ID endpoint
    And admin send DELETE HTTP request with invalid ID for ClassPackages by ID
    Then admin received valid DELETE HTTP response code 200 for ClassPackages by ID

  Scenario: As a user i want to delete ClassPackages by ID
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid DELETE ClassPackages by ID endpoint
    And user send DELETE HTTP request for ClassPackages by ID
    Then admin received valid DELETE HTTP response code 400 Bad Request for ClassPackages by ID