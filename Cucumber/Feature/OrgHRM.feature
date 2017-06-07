Feature: Login and Logout Test

	Scenario: Login
		Given Browser launched and navigated to url
		When Tester Enter username and password 
		And Click on login 
		Then display welcome admin message
		
	Scenario: Logout
		When Tester clicks and welcome admin link
		And also clicks on logout
		Then display login page	
		
		 
		
