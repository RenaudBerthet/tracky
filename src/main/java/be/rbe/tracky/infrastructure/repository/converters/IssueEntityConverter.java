package be.rbe.tracky.infrastructure.repository.converters;

import be.rbe.tracky.domain.Issue;
import be.rbe.tracky.domain.contracts.EntityConverter;
import be.rbe.tracky.infrastructure.repository.entities.IssueEntity;

public class IssueEntityConverter implements EntityConverter<Issue, IssueEntity> {
    @Override
    public Issue toDomain(IssueEntity issueEntity) {
        // todo
        return null;
    }

    @Override
    public IssueEntity toEntity(Issue issue) {
        // todo
        return null;
    }
}
