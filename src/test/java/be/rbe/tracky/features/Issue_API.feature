Feature: Issue API

  Scenario: Create an Issue
    Given The system don't know about any issue
    When A user submits an issue
    Then The server should handle it
    And The server returns a success status
    And The response contains a working link to the new issue

  Scenario: Search for an issue
    Given The system knows about the searched issue
    When A user search for this issue
    Then The server should return the issue as response
    And The server returns a success status

  Scenario: Search for an unknown issue
    Given The system don't know about the searched issue
    When A user search for this issue
    And The server returns a status Not Found

  Scenario: Update an issue
    Given The system knows about the issue
    When A user updates this issue
    Then The issue should be updated
    And The server returns a success status
    And The response contains a link to the issue

  Scenario: Update an unknown issue
    Given The system don't know about the issue
    When A user updates this issue
    And The server returns a status Not Found

  Scenario: Add comment to an issue
    Given The system knows about the issue
    When A user adds a comment to this issue
    Then The comment should be added to the corresponding
    And The server returns a success status
    And The response contains a link to the issue

  Scenario: Add comment to an unknown issue
    Given The system don't know about the issue
    When A user adds a comment to this issue
    And The server returns a status Not Found