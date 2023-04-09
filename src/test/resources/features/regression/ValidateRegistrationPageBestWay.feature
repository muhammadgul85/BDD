Feature: Validate Registration Functionality

Background:  

#Give anyname alongwith tag and reference it in runner file(.java)
@wip0720a
Scenario: Validate Registration 

Given user opens "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
And user clicks link using xpath "//a[text()='New User Register Here']"


And user enters details in registration page
#Below have data table with pipe | symbol 
|username|password|confimr password|full name|email id|captcha|
|reyaz078|reyaz233|reyaz233|Muhammad Gul|abc@gmail.com|idaline|

When user closes the browser
