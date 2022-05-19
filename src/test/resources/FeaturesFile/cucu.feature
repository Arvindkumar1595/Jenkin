Feature: Facebook functionality testing

  @reg
  Scenario: Facebook login Credentials testing
    Given user is on the facebook login page one
    When user should enter the username and password
    And password and user should click the login button
    Then user should verify the success message

  @smoke
  Scenario: Facebook login Credentials testing
    Given user is on the facebook login page two
    When user should enter the username and password
    And password and user should click the login button
    Then user should verify the success message

  @sanity
  Scenario: Facebook login Credentials testing
    Given user is on the facebook login page three
    When user should enter the username and password
    And password and user should click the login button
    Then user should verify the success message
