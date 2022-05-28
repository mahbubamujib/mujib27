Feature: Verify total price including shipping
Scenario: User able to add second heighest dress and see total price
Given User go to practice site
When User click on the dresses tab 
And User capture all dress price from resultset
And User add to cart the second heighest price dress
#And verify total price including shippinguser verify the welcome screen