# Cucumber

Cucumber is a Behavior Driven Development (BDD) framework tool to write test cases.
        
Given – When – Then Approach

    Given: Some given context (Preconditions).
    When: Some Action is performed (Actions).
    Then: Particular outcome/consequence after the above step (Results).

Sample Feature File

    Feature: BDD implementation using Cucumber
    
    Scenario: Login to G-mail using Cucumber plugin
    
    Given User is navigating to G-mail Login Page
    When User enter username as "Username" and password as "Password"
    Then User is successfully navigated to the G-mail Mail Box
    
Verify Cucumber support in Intellij

    Go to Intellij --> File --> Settings --> Plugin and confirm below is enabled 
        1. Gherkin
        2. Cucumber for Java
        3. Cucumber for Groovy
        
Create sample Cucumber Project:

   Followed steps from https://www.hindsightsoftware.com/blog/cucumber-jvm-intellij
    
    1. Create Demo Feature file and list all your scenario, step definitions - Ex Demo.feature
    2. Create Runner class - Ex RunDemo.java
    3. Create step definition file - Ex DemoDefinition.groovy
    4. Execute your RunDemo file and it will run all the steps defined in Demo.feature file
    
Troubleshoots
    
    In case of any issue below are troubleshoots - 
    
    1. If you get Java version setup related error
    
        Then Update POM.xml to add below 
                <properties>
                    <java.version>11</java.version>
                    <maven.compiler.source>1.8</maven.compiler.source>
                    <maven.compiler.target>1.8</maven.compiler.target>
                </properties>
          
    2. If you get below error -
            Eror:Cannot compile Groovy files: no Groovy library is defined for module
                
        Then Add groovy support to your project to run your stepdefinition groovy files 
        
            <dependency>
                <groupId>org.codehaus.groovy</groupId>
                <artifactId>groovy-all</artifactId>
                <version>2.4.17</version>
            </dependency>
            
    
