package be.rbe.tracky.steps;

import be.rbe.tracky.dtos.CommentDTO;
import be.rbe.tracky.dtos.IssueDTO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

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
        IssueDTO issueSubmitted = anIssueDTO();
        response = submitIssueDTO(issueSubmitted);
    }

    private Response submitIssueDTO(IssueDTO issueSubmitted) {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(HOST_URL).path(ISSUE_RESOURCE_PATH);
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        return invocationBuilder.post(Entity.entity(issueSubmitted, MediaType.APPLICATION_JSON));
    }

    private IssueDTO anIssueDTO() {
        CommentDTO aComment = CommentDTO.newCommentDTO().message("Ca traine depuis avant notre déménagement").postedby("Renaud").postedon("Today").build();
        List<CommentDTO> commentDTOS = new ArrayList<>();
        commentDTOS.add(aComment);
        return IssueDTO.newIssueDTO()
                .name("Hole in room wall need to be filled")
                .severity("LOW")
                .comments(commentDTOS)
                .build();
    }

    @Then("The server should handle it")
    public void theServerShouldHandleIt() {

    }

    @And("The server returns a success status")
    public void theServerReturnsASuccessStatus() {
        Assertions.assertThat(response.getStatus()).isEqualTo(Response.Status.CREATED);
    }

    @And("The response contains a working link to the new issue")
    public void theResponseContainsALinkToTheNewIssue() {
        //todo Match UUID => impossible??? Hummmmmmmmmmmmm....Not yet figured out what to do
        String expected = "{link:[ self:\"\"http://localhost:8082/spring-jersey\";123, name:\"John\"}";
        try {
            JSONAssert.assertEquals(
                    response.getEntity().toString(), expected, JSONCompareMode.STRICT);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // request to the link should return http status 200

        // match the reponse against and excpected result
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
