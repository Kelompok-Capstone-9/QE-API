Feature: GET - All ClassPackages

  Scenario: As a admin i want to get all ClassPackages with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all ClassPackages endpoint
    And admin send GET HTTP request with valid endpoint for all ClassPackages
    Then admin received valid GET HTTP response code 200 for all ClassPackages


  Scenario: As a admin i want to get all ClassPackages with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET all Location endpoint
    And admin send GET HTTP request with invalid endpoint for all ClassPackages
    Then admin received valid GET HTTP responses code 400 forall ClassPackages


  Scenario: As a admin i want to get all ClassPackages with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all ClassPackages endpoint
    And admin send GET HTTP request with invalid method for all ClassPackages
    Then admin received valid GET HTTP responses code 404 for all ClassPackages
