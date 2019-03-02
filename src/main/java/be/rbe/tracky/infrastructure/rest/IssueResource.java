package be.rbe.tracky.infrastructure.rest;

import be.rbe.tracky.infrastructure.repository.IssueRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

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
    public JsonObject getIssue(@PathParam("issueID") UUID issueID) {
        String issue = issueRepository.retrieve(issueID);
        if (issue == null) {
            throw new NotFoundException(String.format("Issue with <%s> not Found", issueID));
        }
        String uri = "SOMETHING";
        JsonArrayBuilder links = Json.createArrayBuilder().add("links").add(Json.createObjectBuilder().add("_self", uri).build());
        return Json.createObjectBuilder().add(String.valueOf(issueID), issue).add("links", links).build();
    }

    @GET
    public JsonObject getIssues() {
        return Json.createObjectBuilder().add("yo", "yo").build();
    }
}
