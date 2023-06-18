Feature: DELETE - Class By ID For Admin

  @GFIT-Classes021
  Scenario: As a admin i want to delete class by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE class by ID endpoint
    And admin send DELETE HTTP request with valid endpoint for class by ID
    Then admin received valid DELETE HTTP response code 200 for class by ID

  @GFIT-Classes022
  Scenario: As a admin i want to delete class by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid DELETE class by ID endpoint
    And admin send DELETE HTTP request with invalid endpoint for class by ID
    Then admin received DELETE HTTP response code 404 for class by ID

  @GFIT-Classes023
  Scenario: As a admin i want to delete class by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE class by ID endpoint
    And admin send DELETE HTTP request with invalid method for class by ID
    Then admin received DELETE HTTP response code 404 for class by ID

  @GFIT-Classes024
  Scenario: As a admin i want to delete class by ID without token
    Given admin set valid DELETE class by ID endpoint
    When admin send DELETE HTTP request with valid endpoint for class by ID
    Then admin received DELETE HTTP response code 400 Bad Request for class by ID

  @GFIT-Classes025
  Scenario: As a admin i want to delete class by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID DELETE class by ID endpoint
    And admin send DELETE HTTP request with invalid ID for class by ID
    Then admin received valid DELETE HTTP response code 200 for class by ID