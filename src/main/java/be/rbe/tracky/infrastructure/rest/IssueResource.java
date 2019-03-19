package be.rbe.tracky.infrastructure.rest;

import be.rbe.tracky.domain.Issue;
import be.rbe.tracky.infrastructure.repository.IssueRepository;
import be.rbe.tracky.infrastructure.validator.ValidUUID;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/issue")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class IssueResource {

    IssueRepository issueRepository;

    public IssueResource() {
    }

    @Inject
    public IssueResource(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    @GET
    @Path("/{issueID}")
    public JsonObject getIssue(@PathParam("issueID") @ValidUUID String issueID) {
        Issue issue = issueRepository.retrieve(issueID);
        if (issue == null) {
            throw new NotFoundException(String.format("Issue with <%s> not Found", issueID));
        }
        return createIssueJson(issue);
    }

    @GET
    public JsonArray getIssues() {
        return issueRepository.all().stream().map(this::createIssueJson).collect(Json::createArrayBuilder, JsonArrayBuilder::add, JsonArrayBuilder::add).build();
    }

    private JsonObject createIssueJson(Issue issue) {
        JsonArrayBuilder links = createIssueLinksJson();
        return Json.createObjectBuilder()
                .add("name", issue.getTitle())
                .add("severity", issue.getSeverity().toText())
                .add("comments", "some comments")
                .add("links", links)
                .build();
    }

    private JsonArrayBuilder createIssueLinksJson() {
        String uri = "SOMETHING";
        return Json.createArrayBuilder().add(Json.createObjectBuilder().add("_self", uri).build());
    }
}
