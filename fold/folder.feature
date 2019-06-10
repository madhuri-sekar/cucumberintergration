Feature: Test login functionality
Description: Registered user can use login credentials to get logged into Testmeapp
user name - lalitha
password - password123

Scenario: Test login with valid credentials
Given users open testmeapp
When user enters username as "lalitha"
And user enters password as "password123"
When user clicks Login button
And verify login success
Then close testmeapp 