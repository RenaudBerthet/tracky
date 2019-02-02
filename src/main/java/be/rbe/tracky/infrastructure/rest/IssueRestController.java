package be.rbe.tracky.infrastructure.rest;

import be.rbe.tracky.domain.contracts.IssueRepository;
import be.rbe.tracky.infrastructure.rest.dtos.CommentDTO;
import be.rbe.tracky.infrastructure.rest.dtos.NewIssueDTO;
import be.rbe.tracky.infrastructure.rest.dtos.UpdateIssueDTO;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;

@Path("Issue")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class IssueRestController {

    IssueRepository issueRepository;

    @Inject
    public IssueRestController(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    @POST
    public Response createIssue(NewIssueDTO newIssueDTO) {

        return Response.ok().build();
    }

    @POST
    @Path("/{issueid}/comment")
    public Response addComment(@PathParam("issueid") UUID issueID, CommentDTO commentDTO) {
        //todo Implement method
        return Response.ok().build();
    }

    @PUT
    @Path("/{issueid}")
    public Response updateIssue(@PathParam("issuedid") UUID issueID, UpdateIssueDTO updateIssueDTO) {
        //todo Implement method
        return Response.ok().build();
    }

    @GET
    @Path("/{issueid}")
    public Response findIssue(@PathParam("issuedid") UUID issueID) {
        //todo Implement method
        return Response.ok().build();
    }

}
