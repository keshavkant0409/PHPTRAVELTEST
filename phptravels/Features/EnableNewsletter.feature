@tag
Feature: Subscribe NewsLetter Functionality

	Scenario Outline: verify Newsletter Subscription
		Given Open Web browser and URL 
		When  Scroll to bottom and click on subscribe after entering valid email "<email>"
		Then Newsletter subscription Response
		And Close window
		
	Examples:
			|email|
		|abcd@gmail.com|

#provided email is dummy edit with correct email 
		
		
		