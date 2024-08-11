@tagNew
Feature: To check the Dashboard features

  Background: user is loggin in to ekart portal
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
		When clicks on menu icon
  @smoke1
  Scenario: Check the item list
  	Given user is on login page
    Then user should be able to see the menu list
    And close the browser
    
	@smoke2
  Scenario: Check the cart items
    And Clicks on cart icon
    Then Item should be added in cart
