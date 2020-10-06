

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


@Given("I have a configured Cucumber-JVM project")
public void Given_Step_implementation() {
    println ("Given step implemented");
}

@When("I run it within my IDE")
public void When_Step_implementation() {
    println ("When step implemented");
}

@Then("I will be able to run connected step definitions")
public void Then_Step_implementation() {
    println ("Then step implemented");
}
