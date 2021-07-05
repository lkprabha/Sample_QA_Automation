
Feature: User Login Functionality
  In order to test the user login page as a registered user

  Scenario: User Login with valid credentials and sees the Home page
    Given navigate to udemy site login page
    When User enter userName
    And  user enter PassWord
    And click on  "Sign In" button
    Then user logged in


 # Scenario Outline: User Login with valid credentials and sees the Home page
 #   Given navigate to udemy site login page
 #   When User enter <userName>
 #   And  user enter <PassWord>
 #   And click on  "Sign In" button
 #   Then user logged in

 #  Examples:
  #    |userName|PassWord|
   #   | Prabha    |   test1     |
    #  | Ravi      |   test12    |




