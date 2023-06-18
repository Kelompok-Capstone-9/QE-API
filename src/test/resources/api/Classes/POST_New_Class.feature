Feature: POST - Create New Class For Admin

  @GFIT-Classes008
  Scenario: As a admin i want to create new class with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid POST new class endpoint
    And admin send POST HTTP request with valid endpoint for new class
    Then admin received valid POST HTTP response code 201 for new class

  @GFIT-Classes009
  Scenario: As a admin i want to create new class with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid POST new class endpoint
    And admin send POST HTTP request with invalid endpoint for new class
    Then admin received POST HTTP response code 404 for new class

  @GFIT-Classes010
  Scenario: As a admin i want to create new class with empty request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid POST new class endpoint
    And admin send POST HTTP request with empty request body for new class
    Then admin received POST HTTP response code 400 Bad Request for new class

  @GFIT-Classes011
  Scenario: As a admin i want to create new class with invalid request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid POST new class endpoint
    And admin send POST HTTP request with invalid request body for new class
    Then admin received POST HTTP response code 400 Bad Request for new class

  @GFIT-Classes012
  Scenario: As a admin i want to create new class with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid POST new class endpoint
    And admin send POST HTTP request with invalid method for new class
    Then admin received POST HTTP response code 404 for new class

  @GFIT-Classes013
  Scenario: As a admin i want to create new class without token
    Given admin set valid POST new class endpoint
    When admin send POST HTTP request with valid endpoint for new class
    Then admin received POST HTTP response code 400 Bad Request for new class