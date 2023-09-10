Feature: To validate Adactin login function
Scenario Outline: To verfy adactin login page with valid credential
Given User should be in Adactin home page
When User should enter userName and password with valid credential
#oneDimensional without header
|SivasankarR|
|Success@2023|
And user should verify the login successfull message
Then select from search hotels
And select the hotel details provided and click continue
And provide personal details and payment details
And get the order number

