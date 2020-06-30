#language: en
Feature: Example 2

  @run
  Scenario: market
    When настраиваем драйвер с прокси
    When открываем страницу ноутбуков маркета
    And сортируем ноутбуки по новизне
    And сортируем ноутбуки по цене

