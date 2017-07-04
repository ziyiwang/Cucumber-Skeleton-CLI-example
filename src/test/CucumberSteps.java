package test;

import cucumber.api.java.en.Given;

public class CucumberSteps {


	@Given("^I have a cucumber step and a salad$")
		public void i_have_a_cucumber_step_and_a_salad() throws Throwable {
	}


    @Given("^I have a cucumber step$")
    public void i_have_a_cucumber_step() throws Throwable {
        System.out.println ("Step definition exact match");
    }


    @Given("^I have a (?:tasty|nasty|rusty) cucumber step$")
    public void i_have_a_X_cucumber_step() throws Throwable {
        System.out.println ("Step definition with a non-capturing group");
    }


}
