Feature: Amazon automation for practice.

Scenario: To test amazon login

  Given Test Amazon login with valid username and password
  
  When I launch chrome browser
  And I enter amazon login homepage
  And I enter username
  And I enter password
  Then I click on "login" button