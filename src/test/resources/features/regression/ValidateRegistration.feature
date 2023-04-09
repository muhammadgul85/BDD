Feature: Validate Registration Functionality
#Give anyname alongwith tag and reference it in runner file(.java)
@wip
Scenario: Validate Registration 

Given user opens "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
And user clicks link using xpath "//a[text()='New User Register Here']"
Then users validate the title to be "Adactin.com - New User Registration"
When user closes the browser
