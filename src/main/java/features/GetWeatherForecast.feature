Feature: Get weather forecast

Scenario Outline: Get 5 days weather forecast for a city(Positive)
When Enter City name as <cityname>
And Click Enter
And verify 5 days weather forecast are displayed

Examples:
|cityname|
|Perth|


Scenario Outline: Get 5 days weather forecast for a city1(Negative)
When Enter Invalid City name as <cityname1>
And Click the Invalid city
But verify the error message display

Examples:
|cityname1|
|Chennai|


