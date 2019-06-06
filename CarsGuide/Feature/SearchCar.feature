Feature: Search car on Car guide website

Scenario: Verify search result on Car guide website

Given user is on car guide website
When user hover over buy + sell menu
And click on search cars
And select car make
And select car model
And select car location
And select car price
And click find my car
Then Car result should be displayed 
And the page title should be Audi A3 for Sale NSW carsguide

