Feature: Elements
    To see the options in elements
    Without logging in
    I can click the different options
 
@Escenario1
    Scenario: Users can select Text Box from Elements
        Given I navigate to www.demoqa.com
        When I click on Elements and select Text box
        And I enter the information and click submit
        Then I can validate the information in the page

@Escenario2
    Scenario: Users can select Check Box from Elements
        Given I navigate to www.demoqa.com   
        When I click on Elements and select Check box
        And I click the checks box that i need
        Then I can validate the checks box 

@Escenario3
    Scenario: Users can select Radio Button from Elements
        Given I navigate to www.demoqa.com   
        When I click on Elements and select Radio Button
        And I click radio button Yes
        Then I can validate the Radio Button

@Escenario4
    Scenario: Users can select Buttons from Elements
        Given I navigate to www.demoqa.com   
        When I click on Elements and select Buttons
        And I click the buttons: Double click me Right click me and Click me
        Then I can validate the Buttons clicked         

@Escenario5
    Scenario: Users can select Links from Elements
        Given I navigate to www.demoqa.com   
        When I click on Elements and select Links
        Then I click the different links and I can validate the links clicked

@Escenario6
    Scenario: Users can select Web Tables from Elements
        Given I navigate to www.demoqa.com   
        When I click on Elements and select Web Tables
        And I click Add button and create a new record
        Then I can validate the new record    
               
