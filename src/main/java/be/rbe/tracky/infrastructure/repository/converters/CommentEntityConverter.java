package be.rbe.tracky.infrastructure.repository.converters;

import be.rbe.tracky.domain.Comment;
import be.rbe.tracky.domain.contracts.EntityConverter;
import be.rbe.tracky.infrastructure.repository.entities.CommentEntity;

public class CommentEntityConverter implements EntityConverter<Comment, CommentEntity> {
    @Override
    public Comment toDomain(CommentEntity commentEntity) {
        //todo need to be implemented
        return null;
    }

    @Override
    public CommentEntity toEntity(Comment comment) {
        //todo need to be implemented
        return null;
    }
}
