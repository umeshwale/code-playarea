# Behavior Driven Development (BDD)

Behavior Driven Development (BDD) is an agile software development practice that encourages collaboration between everyone
involved in developing software: developers, testers, and business representatives such as product owners or business analysts.

BDD aims to create a shared understanding of how an application should behave by discovering new features based on concrete examples.
Key examples are then formalized with natural language following a Given/When/Then structure.

Why BDD?

    BDD describes application behavior from a user’s point of view. Overall, the main goal of BDD is to improve the collaboration 
    between all stakeholders involved in developing software and form a shared understanding among them. 
    
    Below are few advantages of BDD - 
        Reduced Rework / Shared Understanding: 
            Concrete examples of expected system behavior foster a shared understanding by being specific enough for developers 
            and testers while still making sense to business participants. 
            Think of a BDD scenario like a bug report that is written in natural-language and posted before the system 
            has been implemented. 
            It describes the steps to reproduce (Given/When) and expected outcome (Then) without the symptoms (unwanted behavior)
            that usually triggered the bug report.
        Faster Feedback: 
            Example scenarios describe focused, granular changes to the system under development. 
            This enables teams to evolve the system in small steps while keeping it potentially shippable, allowing for 
            shorter release cycles and faster feedback.
        Lower Cost
        User Satisfaction: 
            By focusing on the needs of the business, you get satisfied users — which translates to customer loyalty and 
            better business outcomes. 
            The higher degree of test automation frees more time for manual exploratory testing and yields less errors 
            in production, especially when shipping new versions at a high cadence. 
            More frequent, high quality releases enable rapid response to evolving user needs and dynamic market pressuress.
        Code Quality: 
            Using Acceptance Test Driven Development has a positive impact on code quality: it promotes emergent design 
            that ensures loosely-coupled, highly-cohesive architecture and avoids over-engineering and technical debt. 
            This ensures that a system stays testable and maintainable– and that it can be quickly changed to support new 
            requirements without sacrificing stability.
            
How to Implement the BDD Approach?

        Test scenarios should be written in plain language with a detailed description of the test, how to test the 
        application and the application behavior which can be understandable by all.
        Cucumber is a Behavior Driven Development (BDD) framework tool to write test cases.
        
        Given – When – Then Approach
            Given: Some given context (Preconditions).
            When: Some Action is performed (Actions).
            Then: Particular outcome/consequence after the above step (Results).
        
        Sample Feature File
            Feature: BDD implementation using Cucumber
            
            Scenario: Login to G-mail using Cucumber plugin
            
            Given User is navigating to G-mail Login Page
            When User need to enter username as "Username" and password as "Password"
            Then User is successfully navigated to the G-mail Mail Box
       
