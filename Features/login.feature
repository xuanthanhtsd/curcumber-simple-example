Feature: login

  Scenario Outline: Login successfull
    Given User launch chrome browser
    When User open the URL: "http://demo.guru99.com/V4/"
    And User enters user name as "<username>" and password as "<password>"
    And Click on login
    Then Page title shoud be "manger id : mgr123"
    And Close the browser

    Examples: 
      | username | password |
      | mgr123   | mgr!23   |
      | abcxsdf  | pasdfdfs |
