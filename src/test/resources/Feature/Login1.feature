Feature: 

  @Smoke
  Scenario Outline: Test with valid cred
    Given open the browser
    And enter the valid <username> and <password>
    When click on login btn
    Then navigate to home page

    Examples: 
      | username | password |
      | amit     |    12345 |

  @Sanity
  Scenario Outline: Test with invalid cre
    Given open the browser
    And enter the invalid <username> and <password>
    When click on login btn
    Then navigate to home page

    Examples: 
      | username | password |
      | rub      |   123456 |

  @Regression
  Scenario Outline: Test with valid cred
    Given open the browser
    And enter the valid <username> and <password>
    When click on login btn
    Then navigate to home page

    Examples: 
      | username | password |
      | rohit    |    12345 |

  @Smoke @Regression
  Scenario Outline: Test with invalid cred
    Given open the browser
    And enter the invalid <username> and <password>
    When click on login btn
    Then navigate to home page

    Examples: 
      | username | password |
      | sumit    |   123456 |
