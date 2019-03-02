package be.rbe.tracky.infrastructure.rest;

import be.rbe.tracky.infrastructure.repository.IssueRepository;
import be.rbe.tracky.infrastructure.repository.IssueRepositoryJPA;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("issue")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class IssueRestController {

    IssueRepository issueRepository;

    @Inject
    public IssueRestController(IssueRepositoryJPA issueRepository) {
        this.issueRepository = issueRepository;
    }

}
