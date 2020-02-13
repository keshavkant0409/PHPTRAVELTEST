@tag
Feature: Login to PHPTRAVEL

	Scenario Outline: Login to PHPTRAVEL and verify PHPTRAVEL Login
		Given Open Web URL
		When  Enter valid username "<username>" and password "<password>" and submit
		Then Verify Login page
		And Close browser
		
		
	Examples:
		|		username			|		password		|
		|	kantkeshav0409@gmail.com|		Shiv@0120	|

		
		
		