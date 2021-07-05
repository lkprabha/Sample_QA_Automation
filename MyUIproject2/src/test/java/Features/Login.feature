############################ Scenario 01 ####################################################
Feature: User Login Functionality
  In order to test the user login page as a registered user

  Scenario: User Login with valid credentials and sees the Home page
    Given navigate to udemy site login page
    When User enter userName
    And  user enter PassWord
    And click on  Sign In button
    Then user logged in


################################ Scenario 02  ########################################
#  Scenario Outline: User Login with valid credentials and sees the Home page
#    Given navigate to udemy site login page
#    When User enter usernameSO <userName1>
#    And  User enter  passwordSO <PassWord1>
#    And click on  Sign In button
#    Then title should be <title>
#
#    Examples:
#    |userName1|PassWord1|title|
#    | prasliit18@gmail.com | qKccl2q4XpFg | Online Courses - Anytime|
#    | test                 |  123123      | Online Courses - Anytime, Anywhere |
#
#
##################################### Test 03 #####################################
#   Scenario: User Login with valid credentials and sees the Home page
#    Given navigate to udemy site login page
#    When User enter Username "prasliit18@gmail.com"
#    And  User enter Pswd "qKccl2q4XpFg"
#    And click on  Sign In button
#    Then user logged in
#
