Feature: DayForecasthide

Scenario: Select the selected day again and hide the 3 hourly forecast
Given Launch the Browser
And Load the URL
And Maximize the window
And set Timeouts
And Select the selected day again
And Verify 3 hourly forecast is hidden
