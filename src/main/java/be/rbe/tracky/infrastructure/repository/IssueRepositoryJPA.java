package be.rbe.tracky.infrastructure.repository;

import be.rbe.tracky.domain.Comment;
import be.rbe.tracky.domain.Issue;
import be.rbe.tracky.infrastructure.repository.entities.CommentEntity;
import be.rbe.tracky.infrastructure.repository.entities.IssueEntity;
import be.rbe.tracky.infrastructure.repository.mappers.CommentEntityMapper;
import be.rbe.tracky.infrastructure.repository.mappers.IssueEntityMapper;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Stateless
public class IssueRepositoryJPA {

    private EntityManager entityManager;
    private IssueEntityMapper issueEntityMapper;
    private CommentEntityMapper commentEntityMapper;

    public IssueRepositoryJPA() {
    }

    @Inject
    public IssueRepositoryJPA(EntityManager entityManager, IssueEntityMapper issueEntityMapper, CommentEntityMapper commentEntityMapper) {
        this.entityManager = entityManager;
        this.issueEntityMapper = issueEntityMapper;
        this.commentEntityMapper = commentEntityMapper;
    }

    public void save(Issue issue) {
        IssueEntity issueEntity = issueEntityMapper.toEntity(issue);
        entityManager.persist(issueEntity);
    }

    public void addComment(UUID issueID, Comment comment) {
        CommentEntity commentEntity = commentEntityMapper.toEntity(comment);
        IssueEntity issueEntity = entityManager.find(IssueEntity.class, issueID);
        if (issueEntity == null) {
            throw new EntityNotFoundException("Issue not found");
        }
        issueEntity.addComment(commentEntity);
    }

    public void update(UUID issueID, Issue updatedIssue) {
        IssueEntity issueEntity = entityManager.find(IssueEntity.class, issueID);
        if (issueEntity == null) {
            throw new EntityNotFoundException("Issue not found");
        }
        //todo silly code?
        issueEntity.setTitle(updatedIssue.getTitle());
        issueEntity.setSeverity(updatedIssue.getSeverity());
        List<CommentEntity> commentsEntities = updatedIssue.getComments().stream().map(c -> commentEntityMapper.toEntity(c)).collect(Collectors.toList());
        issueEntity.setCommentEntities(commentsEntities);
    }
}
