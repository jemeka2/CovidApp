COVID-19 Contact Tracing

BEGIN
	Main Class
		import Scanner and Arraylist
		
		//Create Variables
		Declare userInfo from Info class
		Declare questions from Symptoms class
		Declare runIn from ContactInfo class
		Declare Scanner
		Declare Arraylist
		declare int index
		Declare Strings

		Add each symptom to the array
		
		//Getting user info
		Prompt user for name
		store name
		Prompt user for phone number
		store number
		Prompt user for email
		store email
		Prompt user for city
		store city
		prompt user for state
		store state

		//Loop
		Create a while that loops for the size of symptom array
			Ask user if they are experiencing a symptom (y/n)

			if user says yes
				get the number of days
				store the number of days in the proper symptom get method based on the symptom name
				add text to a string collection
		//New Loop
		Set userInput back to y
		While userInput is yes
			ask user if they have contacted anyone
			if yes
				get contact info from user
				store contact info
		//Display
		Display the user enough
		Display the symptoms
		Display the other contact infos

	Symptoms Class
		Create a string method that tells the user what symptoms they have if chosen

	Info Class
		get and set the users personal info
		create a string method that displays the users info

	ContactInfo
		Display the other contact info

END