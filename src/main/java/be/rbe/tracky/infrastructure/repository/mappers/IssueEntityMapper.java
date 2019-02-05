package be.rbe.tracky.infrastructure.repository.mappers;

import be.rbe.tracky.domain.Comment;
import be.rbe.tracky.domain.Issue;
import be.rbe.tracky.infrastructure.repository.entities.CommentEntity;
import be.rbe.tracky.infrastructure.repository.entities.IssueEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class IssueEntityMapper {

    @Inject
    CommentEntityMapper commentConverter;

    public Issue toDomain(IssueEntity issueEntity) {
        List<Comment> comments = issueEntity.getCommentEntities().stream().map(c -> commentConverter.toDomain(c)).collect(Collectors.toList());
        return new Issue(issueEntity.getTitle(), issueEntity.getSeverity(), comments);
    }

    public IssueEntity toEntity(Issue issue) {
        List<CommentEntity> comments = issue.getComments().stream().map(c -> commentConverter.toEntity(c)).collect(Collectors.toList());
        return new IssueEntity(issue.getTitle(), issue.getSeverity(), comments);
    }
}
