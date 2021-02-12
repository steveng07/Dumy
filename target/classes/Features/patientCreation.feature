Feature: Data Test App Patient Creation Application

Scenario: Verification of the Patient Creation

Given Open the Chrome and Launch the application

When  Enter the patient details
     |John|James|Smith|9798979567|01011998|Addline 1, Addline2, Country|
     
And  Click on Add New User

Then Close the page
