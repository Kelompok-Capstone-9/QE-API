Feature: GET - User Data By ID

  @GFIT-User018
  Scenario: As a admin i want to get user data by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET user data by ID endpoint
    And admin send GET HTTP request with valid endpoint for user data by ID
    Then admin received valid GET HTTP response code 200 for user data by ID
    And admin received valid user data by ID

  @GFIT-User019
  Scenario: As a admin i want to get user data by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET user data by ID endpoint
    And admin send GET HTTP request with invalid endpoint for user data by ID
    Then admin received valid GET HTTP responses code 404 for user data by ID

  @GFIT-User020
  Scenario: As a admin i want to get user data by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET user data by ID endpoint
    And admin send GET HTTP request with invalid method for user data by ID
    Then admin received valid GET HTTP responses code 404 for user data by ID

  @GFIT-User021
  Scenario: As a admin i want to get user data by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID GET user data by ID endpoint
    And admin send GET HTTP request with invalid ID for user data by ID
    Then admin received valid GET HTTP response code 200 for user data by ID

  @GFIT-User022
  Scenario: As a admin i want to get user data by ID without token
    Given admin set valid GET user data by ID endpoint
    When admin send GET HTTP request with valid endpoint for user data by ID
    Then admin received GET HTTP response code 400 for user data by ID

  @GFIT-User023
  Scenario: As a user i want to get user data by ID with valid ID
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid GET user data by ID endpoint
    And user send GET HTTP request with valid endpoint user data by ID
    Then user received valid GET HTTP response code 200 OK for user data by ID

  @GFIT-User024
  Scenario: As a user i want to get user data by ID with invalid ID
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set invalid ID GET user data by ID endpoint
    And user send GET HTTP request with invalid ID endpoint user data by ID
    Then user received valid GET HTTP response code 401 for user data by ID

