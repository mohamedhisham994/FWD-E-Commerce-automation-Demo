@smoke
  Feature: User can open FaceBook, Twitter, Rss & Youtube from follow Us

    #Scenario1
  Scenario: Facebook icon in the follow us works correctly
    Given user opens homepage and click on Facebook icon
    Then user is redirected to a new Facebook icon

     #Scenario 2
    Scenario: Twitter icon in the follow us works correctly
      Given user opens homepage and click on Twitter icon
      Then user is redirected to a new Twitter icon


       #Scenario 3
    Scenario: RSS icon in the follow us works correctly
      Given user opens homepage and click on RSS icon
      Then user is redirected to a new RSS icon

       #Scenario 4
    Scenario: Youtube icon in the follow us works correctly
      Given user opens homepage and click on Youtube icon
      Then user is redirected to a new Youtube icon