Feature: GET - All Membership
@2
  Scenario: As a admin i want to get all Membership with valid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all Membership endpoint
    And admin send GET HTTP request with valid endpoint for all Membership
    Then admin received valid GET HTTP response code 200 for all Membership


  Scenario: As a admin i want to get all Membership with invalid endpoint
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set invalid GET all Membership endpoint
    And admin send GET HTTP request with invalid endpoint for all Membership
    Then admin received valid GET HTTP responses code 404 for all Membership


  Scenario: As a admin i want to get all Membership with invalid method
    Given admin set authentication endpoint
    And admin send authentication endpoint
    When admin set valid GET all Membership endpoint
    And admin send GET HTTP request with invalid method for all Membership
    Then admin received valid GET HTTP responses code 404 for all Membership
