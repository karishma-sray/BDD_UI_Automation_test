@tag
Feature: Login page Automation of Orange App

  @tag1
  Scenario: Check the login is scuccessfull with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then User should be navigated to home page
    And close the browser