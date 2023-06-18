Feature: GET - Class by ID as a admin

  @GFIT-Classes004
  Scenario: As a admin i want to get class by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET class by ID endpoint
    And admin send GET HTTP request with valid endpoint for class by ID
    Then admin received valid GET HTTP response code 200 for class by ID

  @GFIT-Classes005
  Scenario: As a admin i want to get class by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET class by ID endpoint
    And admin send GET HTTP request with invalid endpoint for class by ID
    Then admin received GET HTTP response code 404 for class by ID

  @GFIT-Classes006
  Scenario: As a admin i want to get class by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET class by ID endpoint
    And admin send GET HTTP request with invalid method for class by ID
    Then admin received GET HTTP response code 404 for class by ID

  @GFIT-Classes007
  Scenario: As a admin i want to get class by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID GET class by ID endpoint
    And admin send GET HTTP request with invalid ID for class by ID
    Then admin received valid GET HTTP response code 200 for class by ID