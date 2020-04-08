@tc_01_Login
Feature: Crossword Loginpage
This feature verifies the fuctionality on  Crossword Loginpage

Scenario Outline: Check that  Crossword Loginpage are working fine or not
Given I launch Chrome browser
When Login Crossword login page opened
Then enter "<username>" and "<password>" in the login field
Then clicks the login button
Then takes a screenshot

Examples:

|username|                                   |password|
|naveen@gmail.com|                           |97884994|      
|naveenreddybaddipadige019@gmail.com|        |naveen@406|
   

   
@tc_02_Toys
Scenario: Check that  Crossword toys page work is ing fine or not
Given I launch Chrme bro
Then clicks on Toys
Then clicks on Toysgames 
Then takes a screenshot for toys


@tc_03_Gifts
Scenario: Check that Crossword gifts page is  working fine or not
Given I lanuch crome
Then clicks Gifts
Then clicks on Books
Then takes a picture


@tc_04_Search
Scenario: Check that search bar is working fine or not
Given I lanuch
Then enter the product name in searchbar
Then shoot picture
Then close the browser

@tc_05_MultipleLoginthroughxlfile
Scenario: Check that user can sign in into crossword page
Given The Crossword page is opened
Then Login page is opened
And The <email> and <password> details are given
And Close browser and quit


   