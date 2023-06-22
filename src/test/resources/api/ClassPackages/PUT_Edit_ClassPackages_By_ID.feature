Feature: PUT - Edit ClassPackages


  Scenario: As a admin i want to Edit ClassPackages with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Edit ClassPackages endpoint
    And user send POST HTTP request with valid endpoint for Edit ClassPackages
    Then user received PUT HTTP response code 200 for Edit ClassPackages

  Scenario: As a admin i want to Edit ClassPackages with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set invalid PUT Edit ClassPackages endpoint
    And user send PUT HTTP request with invalid endpoint for Edit ClassPackages
    Then user received PUT POST HTTP response code 400 for Edit ClassPackages
@2
  Scenario: As a admin i want to Edit ClassPackages with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Edit ClassPackages endpoint
    And user send PUT HTTP request with invalid method for Edit ClassPackages
    Then user received PUT HTTP responses code 404 for Edit ClassPackages

  Scenario: As a admin i want to Edit ClassPackages with empty request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Edit ClassPackages endpoint
    And user send PUT HTTP request with empty request body for Edit ClassPackages
    Then user received PUT POST HTTP response code 400 for Edit ClassPackages

  Scenario: As a admin i want to Edit ClassPackages with invalid request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Edit ClassPackages endpoint
    And user send PUT HTTP request with invalid request body for Edit ClassPackages
    Then user received PUT POST HTTP response code 400 for Edit ClassPackages

  Scenario: As a admin i want to Edit ClassPackages with empty token
    Given user set valid PUT update plan endpoint
    When user send PUT HTTP request with invalid request body for Edit ClassPackages
    Then user received PUT POST HTTP response code 400 for Edit ClassPackages

  Scenario: As a user i want to Edit ClassPackages with valid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid PUT Edit ClassPackages endpoint
    And user send PUT HTTP request with invalid request body for Edit ClassPackages
    Then user received PUT POST HTTP response code 400 for Edit ClassPackages
