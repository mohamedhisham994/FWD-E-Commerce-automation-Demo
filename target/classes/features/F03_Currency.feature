@smoke
Feature:F03_Currency of the product is set as choosen
  Scenario: when user choose EURO, all prices should appear in Euro.
    Given user choose Euro currency from homepage.
    Then product price should appear in Euro.