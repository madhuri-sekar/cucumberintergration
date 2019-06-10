Feature: test background keyword

Background: display welcome
When testme displays welcome message

@login
Scenario: login
When user performs login operation
When user enters user name as "lalitha"
And When user enters password as "password123"

Scenario: search function
When user searching for product available in cart

Scenario: Cart
When user validating the cart

Scenario: proceed to payment
When user performs payment

Scenario: Logout
When user performs logout