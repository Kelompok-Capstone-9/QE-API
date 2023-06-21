Feature: PUT - Update Plan


  Scenario: As a admin i want to Update plan with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT update plan endpoint
    And user send POST HTTP request with valid endpoint for update plan
    Then user received PUT HTTP response code 200 for update plan

  Scenario: As a admin i want to Update plan with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set invalid PUT update plan  endpoint
    And user send PUT HTTP request with invalid endpoint for update plan
    Then user received PUT HTTP responses code 404 for update plan

  Scenario: As a admin i want to Update plan with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT update plan endpoint
    And user send PUT HTTP request with invalid method for update plan
    Then user received PUT HTTP responses code 404 for update plan

  Scenario: As a admin i want to Update plan with empty request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT update plan endpoint
    And user send PUT HTTP request with empty request body for update plan
    Then user received PUT HTTP response code 200 for update plan

  Scenario: As a admin i want to Update plan with invalid request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT update plan endpoint
    And user send PUT HTTP request with invalid request body for update plan
    Then user received PUT HTTP response code 200 for update plan

  Scenario: As a admin i want to Update plan with empty token
    Given user set valid PUT update plan endpoint
    When user send PUT HTTP request with invalid request body for update plan
    Then user received PUT POST HTTP response code 400 for update plan

  Scenario: As a user i want to Update plan with valid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid PUT update plan endpoint
    And user send PUT HTTP request with invalid request body for update plan
    Then user received PUT POST HTTP response code 400 for update plan
