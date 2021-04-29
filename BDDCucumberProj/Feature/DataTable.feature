Feature: DataTable demo

@smoke
Scenario: Successful login with valid entries
Given User is on DemoWebShop login page
When User entered valid email and password
|khandu7@gmail.com|khandu|
Then User should click on log out