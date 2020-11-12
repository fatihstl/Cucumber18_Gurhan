@etsyall
Feature: Etsy searsh
  Agile story:
  User shoud be able to term

  Background: user homepage de
    Given User is on the etsy home page


  Scenario:
     Then User should see title is as expected

  @etsywip
    Scenario: Title verification
      When User searches "Wooden spoon" in the search box
      And User clicks to search button
      Then User should see "Wooden spoon" in the Etsy title

