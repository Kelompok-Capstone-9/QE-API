Feature: PUT - Update Membership


  Scenario: As a admin i want to Update Membership with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Update Membership endpoint
    And user send POST HTTP request with valid endpoint for Update Membership
    Then user received PUT HTTP response code 200 for Update Membership

  Scenario: As a admin i want to Update Membership with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set invalid PUT Update Membership endpoint
    And user send PUT HTTP request with invalid endpoint for Update Membership
    Then user received PUT HTTP responses code 404 for Update Membership

  Scenario: As a admin i want to Update Membership with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Update Membership endpoint
    And user send PUT HTTP request with invalid method for Update Membership
    Then user received PUT HTTP responses code 404 for Update Membership

  Scenario: As a admin i want to Update Membership with empty request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Update Membership endpoint
    And user send PUT HTTP request with empty request body for Update Membership
    Then user received PUT POST HTTP response code 400 for Update Membership

  Scenario: As a admin i want to Update Membership with invalid request body
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When user set valid PUT Update Memberships endpoint
    And user send PUT HTTP request with invalid request body for Update Membership
    Then user received PUT POST HTTP response code 400 for Update Membership

  Scenario: As a admin i want to Update Membership with empty token
    Given user set valid PUT update plan endpoint
    When user send PUT HTTP request with invalid request body for Update Membership
    Then user received PUT POST HTTP response code 400 for Update Membership

  Scenario: As a user i want to Update Membership with valid endpoint
    Given user set authentication endpoint
    And user send authentication endpoint
    When user set valid PUT Update Membership endpoint
    And user send PUT HTTP request with invalid request body for Update Membership User
    Then user received PUT POST HTTP response code 400 for Update Membership
