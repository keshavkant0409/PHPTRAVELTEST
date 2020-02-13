@tag
Feature: Flight Search Functionality

	Scenario: Flight Search using departure, Destination and date
		Given Open Web browser and URL for flight search
		When Select Flight at home and enter departure, destination and date
		And Click on Search
		Then Select Route Stop and Airline
		And Close window after flight search
		
	
