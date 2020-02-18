@tag
Feature: Login to PHPTRAVEL

	Scenario Outline: Login to PHPTRAVEL and verify PHPTRAVEL Login
		Given Open Web URL
		When  Enter valid username "<username>" and password "<password>" and submit
		Then Verify Login page
		And Close browser
		
	#use number of accounts you want to test for login feature.
	# Below is the dummy username and password. Replace with correct one
	
	Examples:
		|		username			|		password		|
		|	abc@gmail.com			|		abcd			|

	
		
		