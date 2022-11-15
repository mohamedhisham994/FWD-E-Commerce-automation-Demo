@smoke
  Feature: user can click on the product in the home slider

      #Scenario 1
  Scenario: when user clicks on product in first slider, product page is opened
    Given user opens homepage and clicks on product in first slider
    Then the page of the product will open ( NOKIA)

     #Scenario 2
    Scenario: when user clicks on product in second slider, product page is opened
      Given user opens homepage and clicks on product in second slider
      Then the page of the product will open (Iphone)