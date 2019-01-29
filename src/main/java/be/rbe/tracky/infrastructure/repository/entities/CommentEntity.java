package be.rbe.tracky.infrastructure.repository.entities;

import be.rbe.tracky.domain.User;

import javax.persistence.Column;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(name = "comments")
public class CommentEntity {
    @Column(name = "message")
    private String message;
    @Column(name = "fk_posted_by_user")
    private User postedBy;
    @Column(name = "postedon")
    private LocalDateTime postedOn;
}
