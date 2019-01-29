package be.rbe.tracky.infrastructure.repository;

import be.rbe.tracky.domain.Comment;
import be.rbe.tracky.domain.Issue;
import be.rbe.tracky.domain.contracts.IssueRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.UUID;

@Stateless
public class IssurRepositoryJPA implements IssueRepository {

    @PersistenceUnit(name = "issuesDB")
    private EntityManager entityManager;

    @Inject
    public IssurRepositoryJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Issue issue) {
        entityManager.persist(issue);
    }

    @Override
    public void addComment(UUID issueID, Comment comment) {
//todo to be implemented
    }

    @Override
    public void update(Issue issue) {
//todo to be implemented
    }

    @Override
    public void find(UUID issueID) {
//todo to be implemented
    }
}
