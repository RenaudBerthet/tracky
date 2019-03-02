package be.rbe.tracky.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.ws.rs.core.Response;

public class APIStepsDef {

    public static final String HOST_URL = "http://0.0.0.0:8080";
    private static final String ISSUE_RESOURCE_PATH = "/tracky/resources/Issue/";
    private Response response;

    @Given("The system don't know about any issue")
    public void theSystemDonTKnowAboutAnyIssue() {
        // do nothing
    }

    @When("A user submits an issue")
    public void aUserSubmitsAnIssue() {
    }

    @Then("The server should handle it")
    public void theServerShouldHandleIt() {

    }

    @And("The server returns a success status")
    public void theServerReturnsASuccessStatus() {

    }

    @And("The response contains a working link to the new issue")
    public void theResponseContainsALinkToTheNewIssue() {
    }

    @Given("The system knows about the searched issue")
    public void theSystemKnowsAboutTheSearchedIssue() {

    }

    @When("A user search for this issue")
    public void aUserSearchForThisIssue() {

    }

    @Then("The server should return the issue as response")
    public void theServerShouldReturnTheIssueAsResponse() {

    }

    @Given("The system don't know about the searched issue")
    public void theSystemDonTKnowAboutTheSearchedIssue() {

    }

    @And("The server returns a status Not Found")
    public void theServerReturnsAStatusNotFound() {

    }

    @Given("The system knows about the issue")
    public void theSystemKnowsAboutTheIssue() {

    }

    @When("A user updates this issue")
    public void aUserUpdatesThisIssue() {

    }

    @Then("The issue should be updated")
    public void theIssueShouldBeUpdated() {

    }

    @And("The response contains a link to the issue")
    public void theResponseContainsALinkToTheIssue() {

    }

    @Given("The system don't know about the issue")
    public void theSystemDonTKnowAboutTheIssue() {

    }

    @When("A user adds a comment to this issue")
    public void aUserAddsACommentToThisIssue() {

    }

    @Then("The comment should be added to the corresponding")
    public void theCommentShouldBeAddedToTheCorresponding() {

    }
}
