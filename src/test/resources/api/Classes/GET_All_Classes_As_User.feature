Feature: GET - All classes as a user

  @GFIT-Classes026
  Scenario: As a user i want to get all classes with valid endpoint
    Given user set valid GET all classes endpoint
    When user send GET HTTP request with valid endpoint for all classes
    Then user received valid GET HTTP response code 200 for all classes

  @GFIT-Classes027
  Scenario: As a user i want to get all classes with invalid endpoint
    Given user set invalid GET all classes endpoint
    When user send GET HTTP request with invalid endpoint for all classes
    Then user received GET HTTP response code 404 for all classes

  @GFIT-Classes028
  Scenario: As a user i want to get all classes with invalid method
    Given user set valid GET all classes endpoint
    When user send GET HTTP request with invalid method for all classes
    Then user received GET HTTP response code 405 Method Not Allowed for all classes