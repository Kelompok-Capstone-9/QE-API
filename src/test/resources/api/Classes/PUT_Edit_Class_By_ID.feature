Feature: PUT - Edit Class By ID For Admin

  @GFIT-Classes014
  Scenario: As a admin i want to edit class by ID with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid PUT class by ID endpoint
    And admin send PUT HTTP request with valid endpoint for edit class by ID
    Then admin received valid PUT HTTP response code 200 for edit class by ID

  @GFIT-Classes015
  Scenario: As a admin i want to edit class by ID with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid PUT class by ID endpoint
    And admin send PUT HTTP request with invalid endpoint for edit class by ID
    Then admin received PUT HTTP response code 404 for edit class by ID

  @GFIT-Classes016
  Scenario: As a admin i want to edit class by ID with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid PUT class by ID endpoint
    And admin send PUT HTTP request with invalid method for edit class by ID
    Then admin received PUT HTTP response code 404 for edit class by ID

  @GFIT-Classes017
  Scenario: As a admin i want to edit class by ID without token
    Given admin set valid PUT class by ID endpoint
    When admin send PUT HTTP request with valid endpoint for edit class by ID
    Then admin received PUT HTTP response code 400 Bad Request for edit class by ID

  @GFIT-Classes018
  Scenario: As a admin i want to edit class by ID with invalid ID
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid ID PUT class by ID endpoint
    And admin send PUT HTTP request with invalid ID for edit class by ID
    Then admin received valid PUT HTTP response code 200 for edit class by ID

  @GFIT-Classes019
  Scenario: As a admin i want to edit class by ID with empty request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid PUT class by ID endpoint
    And admin send PUT HTTP request with empty request body for edit class by ID
    Then admin received PUT HTTP response code 400 Bad Request for edit class by ID

  @GFIT-Classes020
  Scenario: As a admin i want to edit class by ID with invalid request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid PUT class by ID endpoint
    And admin send PUT HTTP request with invalid request body for edit class by ID
    Then admin received PUT HTTP response code 400 Bad Request for edit class by ID