Feature: DELETE - Membership By ID

  Scenario: As a admin i want to delete Membership by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE Membership by ID endpoint
    And admin send DELETE HTTP request with valid endpoint for Membership by ID
    Then admin received valid DELETE HTTP response code 200 for Membership by ID

  Scenario: As a admin i want to delete Membership by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid DELETE Membership by ID endpoint
    And admin send DELETE HTTP request with invalid endpoint for Membership by ID
    Then admin received valid DELETE HTTP responses code 404 for Membership by ID

  Scenario: As a admin i want to delete Membership by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE Membership by ID endpoint
    And admin send DELETE HTTP request with invalid method for Membership by ID
    Then admin received valid DELETE HTTP responses code 404 for Membership by ID
@1
  Scenario: As a admin i want to delete Membership by ID without token
    Given admin set valid DELETE Membership by ID endpoint
    When admin send DELETE HTTP request with valid endpoint for Membership by ID
    Then admin received valid DELETE HTTP response code 400 Bad Request for Membership by ID

  Scenario: As a admin i want to delete Membership by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID DELETE Membership by ID endpoint
    And admin send DELETE HTTP request with invalid ID for Membership by ID
    Then admin received valid DELETE HTTP response code 200 for Membership by ID

  Scenario: As a user i want to delete Membership by ID
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid DELETE Membership by ID endpoint
    And user send DELETE HTTP request for Membership by ID
    Then admin received valid DELETE HTTP response code 400 Bad Request for Membership by ID