Feature: GET - All user data

  @GFIT-User001
  Scenario: As a admin i want to get all user data with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all user data endpoint
    And admin send GET HTTP request with valid endpoint for all user data
    Then admin received valid GET HTTP response code 200 for all user data

  @GFIT-User002
  Scenario: As a admin i want to get all user data with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET all user data endpoint
    And admin send GET HTTP request with invalid endpoint for all user data
    Then admin received valid GET HTTP responses code 404 for all user data

  @GFIT-User003
  Scenario: As a admin i want to get all user data with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all user data endpoint
    And admin send GET HTTP request with invalid method for all user data
    Then admin received valid GET HTTP responses code 404 for all user data

  @GFIT-User004
  Scenario: As a user i want to get all user data
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid GET all user data endpoint
    And user send GET HTTP request with valid endpoint for all user data
    Then user received valid GET HTTP response code 401 for all user data

  @GFIT-User005
  Scenario: As a admin i want to get all user data without token
    Given admin set valid GET all user data endpoint
    When admin send GET HTTP request with valid endpoint for all user data
    Then admin received GET HTTP response code 400 for all user data