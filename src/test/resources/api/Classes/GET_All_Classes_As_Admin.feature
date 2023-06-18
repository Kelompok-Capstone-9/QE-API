Feature: GET - All classes as a admin

  @GFIT-Classes001
  Scenario: As a admin i want to get all classes with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all classes endpoint
    And admin send GET HTTP request with valid endpoint for all classes
    Then admin received valid GET HTTP response code 200 for all classes

  @GFIT-Classes002
  Scenario: As a admin i want to get all classes with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET all classes endpoint
    And admin send GET HTTP request with invalid endpoint for all classes
    Then admin received GET HTTP response code 404 for all classes

  @GFIT-Classes003
  Scenario: As a admin i want to get all classes with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all classes endpoint
    And admin send GET HTTP request with invalid method for all classes
    Then admin received GET HTTP response code 400 Bad Request for all classes