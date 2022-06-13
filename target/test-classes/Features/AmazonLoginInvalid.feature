Feature: To validate amazon login

@smoke
  Scenario Outline: To validate amazon login with valid credentials
    Given user opens the browser
    When user enters <username> and <password>
    And user clicks on login button
    Then user is redirected to home page

    Examples: 
      | username                        | password |
      | nandakishore.shopping@gmail.com | Jan@20203 |
