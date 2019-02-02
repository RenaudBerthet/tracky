package be.rbe.tracky.infrastructure.repository.mappers;

import be.rbe.tracky.domain.Comment;
import be.rbe.tracky.domain.contracts.EntityMapper;
import be.rbe.tracky.infrastructure.repository.entities.CommentEntity;

import javax.ejb.Stateless;

@Stateless
public class CommentEntityMapper implements EntityMapper<Comment, CommentEntity> {
    @Override
    public Comment toDomain(CommentEntity commentEntity) {
        return new Comment(commentEntity.getMessage(), commentEntity.getPostedBy(), commentEntity.getPostedOn());
    }

    @Override
    public CommentEntity toEntity(Comment comment) {
        return new CommentEntity(comment.getMessage(), comment.getPostedBy(), comment.getPostedOn());

    }
}
