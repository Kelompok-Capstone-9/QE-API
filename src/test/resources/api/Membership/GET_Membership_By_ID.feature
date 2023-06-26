Feature: GET - All Membership By ID


  Scenario: As a admin i want to get All Membership by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all Membership by ID endpoint
    And admin send GET HTTP request with valid endpoint for all Membership by ID
    Then admin received valid GET HTTP response code 200 for all Membership by ID

  Scenario: As a admin i want to get Membership by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET all Membership by ID endpoint
    And admin send GET HTTP request with invalid endpoint for all Membership by ID
    Then admin received valid GET HTTP responses code 404 all Membership by ID

  Scenario: As a admin i want to get Membership by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all Membership by ID endpoint
    And admin send GET HTTP request with invalid method for all Membership by ID
    Then admin received valid GET HTTP responses code 404 all Membership by ID

  Scenario: As a admin i want to get Membership by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID GET all Membership by ID endpoint
    And admin send GET HTTP request with invalid ID for all Membership by ID
    Then admin received valid GET HTTP response code 200 for all Membership by ID
