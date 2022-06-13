Feature: to validate fb login

  Scenario Outline: to launch fb login
    Given user opens chrome
    When user launches the <url>
    Then user keys in text to search
    And user clicks on search
    Then User is directed to the search results page

  Scenario Outline: To launch browser 
    Given user opens chrome
    When user launches the <url>
    
    Examples: 
      | url                                         |
      | https://www.youtube.com/watch?v=j3o6r1BB2hI |
      | https://www.google.com/                     |


