package be.rbe.tracky.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
    @Given("today is Sunday")
    public void todayIsSunday() {
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String arg0) {
    }
}
