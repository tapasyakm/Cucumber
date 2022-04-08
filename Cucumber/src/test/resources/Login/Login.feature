Feature: Test the skillrary App
1) Valid Case
2) Invalid Case

Background: 
Given i should open the browser and naviagte to the login page of skillrary
#@positiveTesting
#When Enter Username "user"
#And Enter Password "user"
#And Click on the loginbutton
#Then i should see the username as "Harry Den"

#Scenario: To Test the Login with Admin Credentials
#When Enter Username "admin"
#And Enter Password "admin"
#And Click on the loginbutton
#Then i should see the admin as "SkillRary Admin"

Scenario Outline: To Test Login with all positive data

When Enter Username "<user>"
And Enter Password "<pwd>"
And Click on the loginbutton
Then i should see the username as "<name>"

Examples: 
|user|pwd|name|
|user|user|Harry Den|
|user|user|Harry Den|
#|admin|admin|SkillRary Admin|


#@NegativeTesting
Scenario: To Test the Login with invalid Credentials

When Enter Username "Tapasya"
And Enter Password "ammu123"
And Click on the loginbutton
Then i should navigate to the page "Register"














