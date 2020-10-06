# Gherkin 

[Refer - Gherkin Reference](https://cucumber.io/docs/gherkin/reference/)

Gherkin is the most commonly used syntax for describing examples with Given/When/Then in plain text files, called feature files. 
Gherkin scenarios can be automated to validate the expected behavior.

Gherkin will parse each step written in step definition file, So step mentioned in the feature file and step definition file 
should match.

Gherkin Keywords:

    The primary keywords are:
    
        Feature
        Rule (as of Gherkin 6)
        Example (or Scenario)
        Given, When, Then, And, But for steps (or *)
        Background
        Scenario Outline (or Scenario Template)
        Examples
        
    There are a few secondary keywords as well:
    
        """ (Doc Strings)
        | (Data Tables)
        @ (Tags)
        # (Comments)
        
    Important Keyword Description is as below
    Refer - https://cucumber.io/docs/gherkin/reference/
        
    Feature
        The purpose of the Feature keyword is to provide a high-level description of a software feature, and to 
        group related scenarios. 
            
        The first primary keyword in a Gherkin document must always be Feature, followed by a : and a short text that
        describes the feature.
        
        Example -> Feature: Guess the word
    
    Example/Scenario
    
        The keyword Scenario is a synonym of the keyword Example.
        
        You can have as many steps as you like, but we recommend you keep the number at 3-5 per example. Having too many steps 
        in an example, will cause it to lose it’s expressive power as specification and documentation.
    
    Steps
        Each step starts with Given, When, Then, And, or But.
    
        Cucumber executes each step in a scenario one at a time, in the sequence you’ve written them in. 
        When Cucumber tries to execute a step, it looks for a matching step definition to execute.
    
        Keywords are not taken into account when looking for a step definition. 
        This means you cannot have a Given, When, Then, And or But step with the same text as another step.
        
        Given
            Given steps are used to describe the initial context of the system - the scene of the scenario. 
            It is typically something that happened in the past.
        
        When
            When steps are used to describe an event, or an action. This can be a person interacting with the system, 
            or it can be an event triggered by another system.
        
        Then
            Then steps are used to describe an expected outcome, or result.
        
            The step definition of a Then step should use an assertion to compare the actual outcome (what the system 
            actually does) to the expected outcome (what the step says the system is supposed to do).