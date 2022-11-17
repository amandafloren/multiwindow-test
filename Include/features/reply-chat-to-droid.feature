@tag
Feature: Reply to Droid chat


  @IS
  Scenario Outline: I want to reply Droid chat
    Given I go to Inside Store
    When I click on Droid
    Then I input email to droid chat <email>
    Then I input phone number to droid chat <phonenumber>
    Then I input a message to droid chat <message>

    Examples: 
      |     email    |    phonenumber   |         message           |
      | test@test.cc |  856343434343    | this is a test message 1 |