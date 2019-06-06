Feature: To test ticket booking functionality

Scenario: To test that user can book a flight

Given the user login into application successfully
And he selected the flight details on the flight finder page
And he select the departure and return flight on select flight page
And he enter all the mandatory details on book a flight page  
Then he must get a successful message at the end
