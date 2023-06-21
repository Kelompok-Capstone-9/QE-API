Feature: DELETE - Plan By ID

  Scenario: As a admin i want to delete plan by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE plan by ID endpoint
    And admin send DELETE HTTP request with valid endpoint for plan by ID
    Then admin received valid DELETE HTTP response code 200 for plan by ID

  Scenario: As a admin i want to delete plan by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid DELETE plan by ID endpoint
    And admin send DELETE HTTP request with invalid endpoint for plan by ID
    Then admin received valid DELETE HTTP responses code 404 for plan by ID

  Scenario: As a admin i want to delete plan by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE plan by ID endpoint
    And admin send DELETE HTTP request with invalid method for plan by ID
    Then admin received valid DELETE HTTP responses code 404 for plan by ID

  Scenario: As a admin i want to delete plan by ID without token
    Given admin set valid DELETE plan by ID endpoint
    When admin send DELETE HTTP request with valid endpoint for plan by ID
    Then admin received valid DELETE HTTP response code 400 Bad Request for plan by ID

  Scenario: As a admin i want to delete plan by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID DELETE plan by ID endpoint
    And admin send DELETE HTTP request with invalid ID for plan by ID
    Then admin received valid DELETE HTTP response code 200 for plan by ID

  Scenario: As a user i want to delete plan by ID
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid DELETE plan by ID endpoint
    And user send DELETE HTTP request for plan by ID
    Then admin received valid DELETE HTTP response code 400 Bad Request for plan by ID