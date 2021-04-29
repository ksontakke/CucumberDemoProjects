Feature: Test DemoWebShop application

Background: Driver installed
Given User is on demo login home page

Scenario: Add item to cart
When User try to add item into cart
Then User should see successfull message

Scenario: Add item to wishlist
When User try to add item into wishlist
Then User should see message successfully	