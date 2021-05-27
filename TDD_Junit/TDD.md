# TDD
    
    What is TDD ?
        Test Driven Devlopement 
        
    Why TDD?
        - you can find defects earlier
        - you can easily detect regression errors 
        - you follow a simple process that helps you to design & 
            develop your software in a straightforward way
        - your software cost will be lower
        - tests are living documentation 
        - your software will guide you how a consumer will use your application
        
    Some disadvantages - 
        - It is not easy to start with
        - Has high learning curve
        - Can be a large investment in team 
        - It is difficult to master it    
        
    
    TDD Process 
        - Write a test, watch it fail
        - Write just enough code to pass the test i.e. build
        - Improve the code without changing its behaviour i.e. Refactor
        
    The Rules 
        - You are not allowed to write any production code 
            unless it is to make a failing unit test pass.
        - You are not allowed to write any more of a unit
            test than is sufficient to fail
            
    Good Habits of TDD 
        - Before you write production code check that your test is failing
        - Each test has only 1 reason to fail
        
        - Write the assertion first 
        - Test Naming convention
            Ex: 
                should_fail_when_content_is_split_and_is_not_joined
                should_return_extractor_when_content_is_not_split
        - our test will be more clear
        
    Test Creation Order:
        1. Name the class
        2. NAme the method - should_return_result
        3. Define what you want to check i.e. wrtie Assers
        4. Trigger the code
        5. Do the setup
