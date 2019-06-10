Feature: Login function

Scenario Outline: Login with multiple data

Given Tester opening testmeapp
When Tester enter username as "<username>" And password as "<password>"
Then Click ok
And Verify login page result

Examples:
|username|password|
|lalitha|password123|
#|saranya|password123|
#|john|mercury|