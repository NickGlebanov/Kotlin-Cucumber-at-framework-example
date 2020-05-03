#language: en
Feature: Example 2

  @run
  Scenario: Example 1
    When test started
    And put random value to context
    Then assert 1 == 1
    And show context

  @run
  Scenario: Example 2
    When test started
    And put random value to context
    And wait
    Then assert 1 == 1
    And show context

  @run
  Scenario: Example 3
    When test started
    And put random value to context
    Then assert 1 == 1
    And show context

  @run
  Scenario: Example 4
    When test started
    And put random value to context
    Then assert 1 == 1
    And show context

  @run
  Scenario: Example 5
    When test started
    And put random value to context
    Then assert 1 == 1
    And show context

  @run
  Scenario: Example 6
    When test started
    And put random value to context
    Then assert 1 == 1
    And show context