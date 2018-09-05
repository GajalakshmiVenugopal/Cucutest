Feature: DailyForecastSummary

Scenario Outline: Daily Forecast 
Given Launch the Browser
And Load the URL
And Maximize the window
And set Timeouts
And Select a day
And Verify 3 hourly forecast is displayed
And check and display the most dominant(or current) condition
And check and display the most dominant (or current) wind speed and direction
And validate the aggregate rainfall
And validate the minimum and maximum temperature



