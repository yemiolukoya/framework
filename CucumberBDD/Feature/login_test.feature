Feature: To test the login functionality of Newtours application

Background:
Given the user is on login page


Scenario: To test the login functionality with valid credentials 
When I enter a valid username 
And a valid password
And he clicks on the submit button
Then he must be able to see the SIGN-OFF option 

Scenario Outline: To test the login functionality with incorrect username and password
When the user enters his valid "<userName>"
And the user enters invalid "<password>"
And he clicks on the submit button
Then the user must see the SIGN-ON option

Examples:
|userName	|password|
| abc@d.co|qwertye |
| abc@d.co|qwedrfg |
| abc@d.co|qawsedr |
| abc@d.co|qwesdrf |


