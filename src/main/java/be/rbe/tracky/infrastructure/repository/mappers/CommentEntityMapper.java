package be.rbe.tracky.infrastructure.repository.mappers;

import be.rbe.tracky.domain.Comment;
import be.rbe.tracky.infrastructure.repository.entities.CommentEntity;

import javax.ejb.Stateless;

@Stateless
public class CommentEntityMapper {

    public Comment toDomain(CommentEntity commentEntity) {
        return new Comment(commentEntity.getMessage(), commentEntity.getPostedBy(), commentEntity.getPostedOn());
    }

    public CommentEntity toEntity(Comment comment) {
        return new CommentEntity(comment.getMessage(), comment.getPostedBy(), comment.getPostedOn());

    }
}
