Feature: Facebook functionality testing

  Scenario Outline: Facebook login Credentials testing
    Given user is on the facebook login page
    When user should enter the "<username>"and "<password>"
    And password and user should click the login button
    Then user should verify the success message

    Examples: 
      | username ||password|
      | deepak   ||dee@123|
