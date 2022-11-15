@smoke
Feature: user can save products in wishList

  #scenario 1
  Scenario: product is added to wishlist after user clicks on wishlist icon.
    Given user open homePage and clicks on htc wish icon.
      Then product is added to the wishlist.


     #scenario 2
  Scenario: check that number of products in wishList is more than 0 after clicking on wish icon .
    Given user open homePage and clicks on htc wish icon.
    Then product is added to the wishlist and and number of products is more than 0.