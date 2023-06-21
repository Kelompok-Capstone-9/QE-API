Feature: GET - All Location

  Scenario: As a admin i want to get all Location with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all Location endpoint
    And admin send GET HTTP request with valid endpoint for all Location
    Then admin received valid GET HTTP response code 200 for all Location


  Scenario: As a admin i want to get all Location with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET all Location endpoint
    And admin send GET HTTP request with invalid endpoint for all Location
    Then admin received valid GET HTTP responses code 404 for all Location


  Scenario: As a admin i want to get all Location with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all Location endpoint
    And admin send GET HTTP request with invalid method for all Location
    Then admin received valid GET HTTP responses code 404 for all Location
