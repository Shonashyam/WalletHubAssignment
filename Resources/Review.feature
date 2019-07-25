Feature: Validate Facebook and Wallethub Applications
#===========================================================================================
#ASSIGNMENT-I
#============================================================================================

#Scenario One
		  Scenario: validate Facebook login page with different credentials
		  Given User launches the Browser and enters the required url
		  When User enters the username "Userone" and password "Rathod@123" and click on login button
		  And User enters the username "Usertwo" and password "Password2" and click on login button
		  And User enters the username "rathodsingh@gmail.com" and password "rithi@222" and click on login button
		  Then  Status message "Hello World" should display
		  

#==============================================================================================   
#ASSIGNMENT-II
#==============================================================================================

#Scenario one
		  Scenario: Validate the Review Text for the Wallethub Health Insurance Company
		  Given  User already launched the browser and navigate to Wallethub url
		  And User overs to fourth and fifth start and click on them
		  And User click on Write Review button
		  Then User Redirected to next page 
		  Then User select "Health Insurance" from Policy Drop down
		  Then User Provides the Review at least 200 characters
		  Then User Submits and confirm the Review
	
#Scenario two
		  Scenario: Validate Review whether properly posted or not
	 	  Given User is already on the Wallet home page
		  And user clicks on Sign in Link
		  When User enters Emailid "solution.ramesh17@gmail.com " pwd  "Shona@143" and Clicks on Login button
		  Then Your Review Text should display as expected 

		  








   


