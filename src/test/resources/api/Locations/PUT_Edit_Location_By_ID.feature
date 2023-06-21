Feature: PUT - Edit Location


  Scenario: As a admin i want to Edit Location with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Edit Location endpoint
    And user send POST HTTP request with valid endpoint for Edit Location
    Then user received PUT HTTP response code 200 for Edit Location

  Scenario: As a admin i want to Edit Location with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set invalid PUT Edit Location endpoint
    And user send PUT HTTP request with invalid endpoint for Edit Location
    Then user received PUT HTTP responses code 404 for Edit Location

  Scenario: As a admin i want to Edit Location with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Edit Location endpoint
    And user send PUT HTTP request with invalid method for Edit Location
    Then user received PUT HTTP responses code 404 for Edit Location

  Scenario: As a admin i want to Edit Location with empty request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Edit Location endpoint
    And user send PUT HTTP request with empty request body for Edit Location
    Then user received PUT POST HTTP response code 400 for Edit Location

  Scenario: As a admin i want to Edit Location with invalid request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Edit Location endpoint
    And user send PUT HTTP request with invalid request body for Edit Location
    Then user received PUT POST HTTP response code 400 for Edit Location

  Scenario: As a admin i want to Edit Location with empty token
    Given user set valid PUT update plan endpoint
    When user send PUT HTTP request with invalid request body for Edit Location
    Then user received PUT POST HTTP response code 400 for Edit Location

  Scenario: As a user i want to Edit Location with valid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid PUT Edit Location endpoint
    And user send PUT HTTP request with invalid request body for Edit Location
    Then user received PUT POST HTTP response code 400 for Edit Location
