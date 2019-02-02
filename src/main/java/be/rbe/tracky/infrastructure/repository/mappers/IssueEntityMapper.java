package be.rbe.tracky.infrastructure.repository.mappers;

import be.rbe.tracky.domain.Comment;
import be.rbe.tracky.domain.Issue;
import be.rbe.tracky.domain.contracts.EntityMapper;
import be.rbe.tracky.infrastructure.repository.entities.CommentEntity;
import be.rbe.tracky.infrastructure.repository.entities.IssueEntity;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class IssueEntityMapper implements EntityMapper<Issue, IssueEntity> {

    @Inject
    CommentEntityMapper commentConverter;

    @Override
    public Issue toDomain(IssueEntity issueEntity) {
        List<Comment> comments = issueEntity.getCommentEntities().stream().map(c -> commentConverter.toDomain(c)).collect(Collectors.toList());
        return new Issue(issueEntity.getTitle(), issueEntity.getSeverity(), comments);
    }

    @Override
    public IssueEntity toEntity(Issue issue) {
        List<CommentEntity> comments = issue.getComments().stream().map(c -> commentConverter.toEntity(c)).collect(Collectors.toList());
        return new IssueEntity(issue.getTitle(), issue.getSeverity(), comments);
    }
}
