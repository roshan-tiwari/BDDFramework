Feature: Email account creation.

Scenario: To create email account

  Given I am on gmail account page
  
  Then I click on "Create an account"
   And I enter firstname
  And I enter last name
  And I enter username
  And I enter password
  And I enter confirm password
  And I click on next
  
  