@smoke
  Feature: user can hover and select randomly any subCategories

    Scenario: user can select any main category
    Given user open homePage and hover on main category
      When user select a subCategory
      Then subCategory should open successfully