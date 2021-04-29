Feature: Login Test

@smoke
Scenario: Successful login with valid credentials
Given User is on the login page
When User enters username and password
Then User should view Logout button

@functional
Scenario Outline: Login with multiple data
Given User should on webshop login page
When User login with <email> and <password> 
Then User should see logout link

Examples:
|email								|password	|
|khandu@gmail.com			|khandu		|
|khandu7@gmail.com		|khandu		|
