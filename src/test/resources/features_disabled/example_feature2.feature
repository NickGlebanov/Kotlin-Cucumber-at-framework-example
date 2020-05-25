#language: en
Feature: Example

  @run
  Scenario: Example 1
    When test started
    Then assert 1 == 1
    And show context

  @run
  Scenario: Example 2
    When test started
    And wait
    Then assert 1 == 1
    And show context

  @run
  Scenario: Example 3
    When test started
    Then assert 1 == 1
    And show context

  @run
  Scenario: Example 4
    When test started
    Then assert 1 == 1
    And show context

  @run
  Scenario: Example 5
    When test started
    Then assert 1 == 1
    And show context


  Scenario: Example 6
    When test started
    Then assert 1 == 1
    And show context