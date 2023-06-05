  Feature: POST - Login

  @GFIT-User010
  Scenario: As a user i want to login with valid endpoint
    Given user set valid POST login endpoint
    When user send POST HTTP request with valid endpoint for login
    Then user received POST HTTP response code 200 for login

  @GFIT-User011
  Scenario: As a user i want to login with invalid endpoint
    Given user set invalid POST login endpoint
    When user send POST HTTP request with invalid endpoint for login
    Then user received POST HTTP responses code 404 for login

  @GFIT-User012
  Scenario: As a user i want to login with invalid method
    Given user set valid POST login endpoint
    When user send POST HTTP request with invalid method for login
    Then user received POST HTTP response code 405 Method Not Allowed for login

  @GFIT-User013
  Scenario: As a user i want to login with empty request body
    Given user set valid POST login endpoint
    When user send POST HTTP request with empty request body for login
    Then user received valid POST HTTP response code 400 for login

  @GFIT-User014
  Scenario: As a user i want to login with invalid request body
    Given user set valid POST login endpoint
    When user send POST HTTP request with invalid request body for login
    Then user received valid POST HTTP response code 400 for login

  @GFIT-User015
  Scenario: As a user i want to register with invalid email
    Given user set valid POST login endpoint
    When user send POST HTTP request with invalid email for login
    Then user received valid POST HTTP response code 400 for login



