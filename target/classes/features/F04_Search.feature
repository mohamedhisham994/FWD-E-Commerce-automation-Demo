@smoke
  Feature:user can search with either product or Serial Number.
    #Scenario1
    Scenario Outline: user can search with product
      Given user write the "<product>" in the search bar in homepage
      When user clicks on search button
      Then the "<product>" name should contain the name in the search

      Examples:
        | product |
        | Book    |
        | Laptop  |
        | Nike    |

      #Scenario2
    Scenario Outline: user could search for product using sku
      Given user write the "<sku>" in the search bar in homepage
      When user clicks on search button
      Then the product appear should contain the "<sku>"

      Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|