Feature: GET - All Plan By ID


  Scenario: As a admin i want to get All Plan by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all plan by ID endpoint
    And admin send GET HTTP request with valid endpoint for all plan by ID
    Then admin received valid GET HTTP response code 200 for all plan by ID

  Scenario: As a admin i want to get Plan by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET all plan by ID endpoint
    And admin send GET HTTP request with invalid endpoint for all plan by ID
    Then admin received valid GET HTTP responses code 404 for all plan by ID

  Scenario: As a admin i want to get Plan by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all plan by ID endpoint
    And admin send GET HTTP request with invalid method for all plan by ID
    Then admin received valid GET HTTP responses code 404 for all plan by ID

  Scenario: As a admin i want to get Plan by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID GET all planby ID endpoint
    And admin send GET HTTP request with invalid ID for all plan by ID
    Then admin received valid GET HTTP response code 200 for all plan by ID
