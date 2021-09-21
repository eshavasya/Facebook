@Home @Login
Feature: Validating the login functionality of facebook

Background:
         Given Launch the Browser
         And open the facebook Application
@reg
Scenario Outline: Validate the login Functionality with all type of Credentials
           When enter the "<username>" and "<password>"  
           And click the login button
           Then validate the "<msg>" msg
           Then close the browser   

        Examples:
        |username|password|msg|
        |Ramya|Teja|Log in as Ramya Burgess|
        |Neha|Agastya|wrong|
        |diya|anaga|wrong|

@reg       
Scenario Outline: Validate the login Functionality with all type of Credentials
           When enter the "<username>" and "<password>"  
           And click the login button
           Then validate the "<msg>" msg
           Then close the browser   

        Examples:
        |username|password|msg|
        |besant|Teja|wrong|
        