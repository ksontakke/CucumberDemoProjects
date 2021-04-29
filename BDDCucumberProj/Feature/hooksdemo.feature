Feature: Signin
Scenario: Test Login with valid credentials
Given User is on demowebshop site
When User provide valid data
Then User should login successfully