Feature: PUT - Edit User Data By ID

  @GFIT-User025
  Scenario: As a user i want to edit user data by ID with valid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid PUT user data by ID endpoint
    And user send PUT HTTP request with valid endpoint for user data by ID
    Then user received valid PUT HTTP response code 200 for user data by ID
    And user received valid user data by ID

  @GFIT-User026
  Scenario: As a user i want to edit user data by ID with invalid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set invalid PUT user data by ID endpoint
    And user send PUT HTTP request with invalid endpoint for user data by ID
    Then user received valid PUT HTTP responses code 404 for user data by ID

  @GFIT-User027
  Scenario: As a user i want to edit user data by ID with invalid method
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid PUT user data by ID endpoint
    And user send PUT HTTP request with invalid method for user data by ID
    Then user received valid PUT HTTP responses code 404 for user data by ID

  @GFIT-User028
  Scenario: As a user i want to edit user data by ID without token
    Given user set valid PUT user data by ID endpoint
    When user send PUT HTTP request with valid endpoint for user data by ID
    Then user received PUT HTTP response code 400 for user data by ID

  @GFIT-User029
  Scenario: As a user i want to edit user data by ID with invalid ID
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set invalid ID PUT user data by ID endpoint
    And user send PUT HTTP request with invalid ID for user data by ID
    Then user received PUT HTTP response code 401 Unauthorized for user data by ID