@Login
Feature: Validating the login functionality of facebook

Background:
         Given Launch the Browser
         And open the facebook Application
@this
Scenario: Validate the login Functionality with all type of Credentials

           When enter the username and password  
           |username|password|
           |thillai|teja|
           |ramya|Arasu|
           And click the login button
           Then validate the "<msg>" message
           Then close the browser   

      



    