Feature: Remote Access
  AS A developer & Zoom user 
  I WANT TO be able to request control over my colleagues computer
  SO THAT I can modify stuff from my colleague computer

  Background: 
    Given the presenter is sharing their screen
    And we are in a live Zoom call together

  Scenario: Request Enabled
    And the presenter is sharing his screen and has not disabled taking control
    When we are in a live Zoom call together
    Then I am displayed a button to request control
    But Requester cannot access it by default

  Scenario: Request Disabled
    And the presenter is sharing his screen and has not disabled taking control
    When we are in a live Zoom call together
    Then I am displayed a button to request control

  
