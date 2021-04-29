Feature: Test login with multiple data
Scenario Outline: Login with multiple data
Given User should on webshop login page
When User login with <email> and <password> 
Then User should see logout link

Examples:
|email								|password	|
|khandu@gmail.com			|khandu		|
|khandu7@gmail.com		|khandu		|