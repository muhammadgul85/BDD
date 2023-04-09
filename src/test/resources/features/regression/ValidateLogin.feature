Feature: Validate Login Functionality
#Give anyname alongwith tag and reference it in runner file(.java)
@smoke
Scenario: Validate Login using valid credentials 

Given user opens "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz0617" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz1234" in textbox using xpath "//input[@name='password']"
And user clicks login button using xpath "//input[@name='login']"
#Then users validate the title to be "Adactin.com - Search Hotel"
Then user validates the title to be "Adactin.com - Hotel Reservation System"
When the user clicks on the image using xpath "//img[contains(@src,'ios-button')]"
When user closes the browser

Scenario Outline: Validate Login using valid credentials 

Given user opens "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text '<username>' in textbox using xpath "//input[@name='username']"
And user enters text '<password>' in textbox using xpath "//input[@name='password']"
And user clicks login button using xpath "//input[@name='login']"
Then users validate the title to be '<expTitle>'
When user closes the browser

Examples: 
|username|password|expTitle|
|reyaz0617|reyaz06456|Adactin.com - Hotel Reservation System|
|reyaz0212|reyaz123|Adactin.com - Hotel Reservation System|
|reyaz1212|reyaz06456|Adactin.com - Hotel Reservation System|