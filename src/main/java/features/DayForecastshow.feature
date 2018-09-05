Feature: DayForecastshow

Scenario Outline: Select day and get 3 hourly forecast
When Enter City name as <cityname>
And Click Enter
Given Select a day
And Get the number of forecast displayed
And Verify 3 hourly forecast is displayed

Examples:
|cityname|
|Perth|
