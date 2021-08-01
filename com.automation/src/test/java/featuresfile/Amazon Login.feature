Feature: Amazon automation for practice.

Scenario: To test amazon login

  Given Test Amazon login with valid username and password
  
  When I launch chrome browser
  And I click amazon login homepage
  And I enter "email" id
  And I click on "continue" button
  And I enter "password" 
  And I enter password
  Then I click on "login" button

  
#    Examples:
#   			| email |
#   			| roshant555@gmail.com |