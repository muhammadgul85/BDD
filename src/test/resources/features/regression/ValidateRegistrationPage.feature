Feature: Validate Registration Functionality
#Give anyname alongwith tag and reference it in runner file(.java)
@wip0720
Scenario: Validate Registration 

Given user opens "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
And user clicks link using xpath "//a[text()='New User Register Here']"


And user enters details in registration page
#Below have data table with pipe | symbol 
|reyaz078|reyaz233|reyaz233|Muhammad Gul|abc@gmail.com|idaline|

When user closes the browser
