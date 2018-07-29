Feature: Create account of facebok
As a auser u need to open facebook home page and do the validations

Scenario: Validate First Name field
Given User need to be on Facebook login page
When User enters user "david" first name
Then User checks user "david" first name is present

#Scenario : Validate create user multiple fields
#Given User need to be on Facebook login page
#When User enters user first name
#And User enters user surname
#Then User User checks user first name is present
#But User Mobile field should be blank