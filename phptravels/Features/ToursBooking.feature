@tag
Feature: Check share feature and complete booking of Tour

	Scenario: share feature and complete booking of Tour
		Given Open Web URL of Featured tour
		When  select tour
		And verify email share option
		And Enter Booking options details
		And click Check Availability
		Then Personal Details page will open. Enter personal details
		And click Check Availability for booking
		And Close tour browser page
		
		
		
	