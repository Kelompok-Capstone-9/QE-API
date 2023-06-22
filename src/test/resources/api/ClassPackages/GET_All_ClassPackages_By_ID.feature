Feature: GET - All ClassPackage By ID


  Scenario: As a admin i want to get All ClassPackage by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all ClassPackage by ID endpoint
    And admin send GET HTTP request with valid endpoint for all ClassPackage by ID
    Then admin received valid GET HTTP response code 200 for all ClassPackage by ID
@1
  Scenario: As a admin i want to get ClassPackage by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET all ClassPackage by ID endpoint
    And admin send GET HTTP request with invalid endpoint for all ClassPackage by ID
    Then admin received valid GET HTTP responses code 400 for allClassPackage by ID

  Scenario: As a admin i want to get ClassPackage by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all ClassPackage by ID endpoint
    And admin send GET HTTP request with invalid method for all ClassPackage by ID
    Then admin received valid GET HTTP responses code 404 all ClassPackage by ID

  Scenario: As a admin i want to get ClassPackage by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID GET all ClassPackage by ID endpoint
    And admin send GET HTTP request with invalid ID for all ClassPackage by ID
    Then admin received valid GET HTTP response code 200 for all ClassPackage by ID
