Feature: DELETE - User Data By ID

  @GFIT-User030
  Scenario: As a admin i want to delete user data by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE user data by ID endpoint
    And admin send DELETE HTTP request with valid endpoint for user data by ID
    Then admin received valid DELETE HTTP response code 200 for user data by ID

  @GFIT-User031
  Scenario: As a admin i want to delete user data by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid DELETE user data by ID endpoint
    And admin send DELETE HTTP request with invalid endpoint for user data by ID
    Then admin received valid DELETE HTTP responses code 404 for user data by ID

  @GFIT-User032
  Scenario: As a admin i want to delete user data by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid DELETE user data by ID endpoint
    And admin send DELETE HTTP request with invalid method for user data by ID
    Then admin received valid DELETE HTTP responses code 404 for user data by ID

  @GFIT-User033
  Scenario: As a admin i want to delete user data by ID without token
    Given admin set valid DELETE user data by ID endpoint without token
    When admin send DELETE HTTP request with valid endpoint for user data by ID without token
    Then admin received valid DELETE HTTP response code 400 Bad Request for user data by ID

  @GFIT-User034
  Scenario: As a admin i want to delete user data by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID DELETE user data by ID endpoint
    And admin send DELETE HTTP request with invalid ID for user data by ID
    Then admin received valid DELETE HTTP response code 200 for user data by ID

  @GFIT-User035
  Scenario: As a user i want to delete user data by ID
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid DELETE user data by ID endpoint
    And user send DELETE HTTP request for user data by ID
    Then user received valid DELETE HTTP response code 401 for user data by ID