  Feature: POST - Login

  @GFIT-User010
  Scenario: As a user i want to login with valid endpoint
    Given user set valid POST login endpoint
    When user send POST HTTP request with valid endpoint for login
    Then user received POST HTTP response code 200 for login

  @GFIT-User011
  Scenario: As a user i want to register with invalid endpoint
    Given user set invalid POST register endpoint
    When user send POST HTTP request with invalid endpoint for register
    Then user received POST HTTP responses code 404 for register

  @GFIT-User012
  Scenario: As a user i want to register with invalid method
    Given user set valid POST register endpoint
    When user send POST HTTP request with invalid method for register
    Then user received POST HTTP response code 405 Method Not Allowed for register

  @GFIT-User013
  Scenario: As a user i want to register with empty request body
    Given user set valid POST register endpoint
    When user send POST HTTP request with empty request body for register
    Then user received valid POST HTTP response code 400 for register

  @GFIT-User014
  Scenario: As a user i want to register with invalid request body
    Given user set valid POST register endpoint
    When user send POST HTTP request with invalid request body for register
    Then user received valid POST HTTP response code 400 for register

  @GFIT-User015
  Scenario: As a user i want to register with email that have been registered
    Given user set valid POST register endpoint
    When user send POST HTTP request with registered email for register
    Then user received valid POST HTTP response code 409 Conflict for register



