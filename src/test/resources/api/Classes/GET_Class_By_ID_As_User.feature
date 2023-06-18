Feature: GET - Class by ID as a user

  @GFIT-Classes029
  Scenario: As a user i want to get class by ID with valid endpoint
    Given user set valid GET class by ID endpoint
    When user send GET HTTP request with valid endpoint for class by ID
    Then user received valid GET HTTP response code 200 for class by ID

  @GFIT-Classes030
  Scenario: As a user i want to get class by ID with invalid endpoint
    Given user set invalid GET class by ID endpoint
    When user send GET HTTP request with invalid endpoint for class by ID
    Then user received GET HTTP response code 404 for class by ID

  @GFIT-Classes031
  Scenario: As a user i want to get class by ID with invalid method
    Given user set valid GET class by ID endpoint
    When user send GET HTTP request with invalid method for class by ID
    Then user received GET HTTP response code 405 Method Not Allowed for class by ID

  @GFIT-Classes032
  Scenario: As a user i want to get class by ID with invalid ID
    Given user set valid GET class by ID endpoint with invalid ID
    When user send GET HTTP request with invalid ID for class by ID
    Then user received valid GET HTTP response code 200 for class by ID