Feature: GET - All Plan

  Scenario: As a admin i want to get all plan  with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all plan endpoint
    And admin send GET HTTP request with valid endpoint for all plan
    Then admin received valid GET HTTP response code 200 for all plan


  Scenario: As a admin i want to get all plan with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET all plan endpoint
    And admin send GET HTTP request with invalid endpoint for all plan
    Then admin received valid GET HTTP responses code 404 for all plan


  Scenario: As a admin i want to get all plan with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all plan endpoint
    And admin send GET HTTP request with invalid method for all plan
    Then admin received valid GET HTTP responses code 404 for all plan
