Feature: background test
Background: Installed driver
Given I im on the demowebshop homw page

Scenario: verify title
Then I should see title contains shop
Scenario: verify page source
Then I should see page source contains shop