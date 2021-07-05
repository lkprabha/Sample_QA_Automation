############################### Scenario 02  ########################################
Scenario: User Login with valid credentials and sees the Home page
    Given navigate to udemy site login page
    When User enter following for Login
|username|password|
| prasliit18@gmail.com | qKccl2q4XpFg |
| test                 |  123123      |
    And click on  Sign In button
    Then User should see the home page



