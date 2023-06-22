Feature: POST - Craete New ClassPackages


  Scenario: As a admin i want to create New ClassPackages with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create New ClassPackages endpoint
    And user send POST HTTP request with valid endpoint for create New ClassPackages
    Then user received POST HTTP responses code 201 for create NewClassPackages

  Scenario: As a admin i want to create New ClassPackages with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set invalid POST create New ClassPackages endpoint
    And user send POST HTTP request with invalid endpoint for create New ClassPackages
    Then user received POST HTTP responses code 404 for create New ClassPackages

  Scenario: As a admin i want to create New ClassPackages with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create New ClassPackages endpoint
    And user send POST HTTP request with invalid method for create New ClassPackages
    Then user received POST HTTP responses code 404 for create New ClassPackages

  Scenario: As a admin i want to create New ClassPackages with empty request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create New ClassPackages endpoint
    And user send POST HTTP request with empty request body for create New ClassPackages
    Then user received POST HTTP response code 400 for create New ClassPackages

  Scenario: As a admin i want to create New ClassPackages with invalid request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid POST create New ClassPackages endpoint
    And user send POST HTTP request with invalid request body for create New ClassPackages
    Then user received POST HTTP response code 400 for create New ClassPackages

  Scenario: As a admin i want to create New ClassPackages with empty token
    Given user set valid POST create New ClassPackages endpoint
    When user send POST HTTP request with invalid request body for create New ClassPackages
    Then user received valid POST HTTP response code 400 for create New ClassPackages

  Scenario: As a user i want to create New ClassPackages with valid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid POST create New ClassPackages endpoint
    And user send POST HTTP request with invalid request body for create New ClassPackages
    Then user received valid POST HTTP response code 400 for create New ClassPackages
