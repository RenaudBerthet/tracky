package be.rbe.tracky.infrastructure.repository.entities;

import be.rbe.tracky.domain.User;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(name = "comments")
public class CommentEntity {
    @Column(name = "message")
    private String message;
    @Column(name = "fk_posted_by_user")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "employee")
    private User postedBy;
    @Column(name = "postedon")
    private LocalDateTime postedOn;

    public CommentEntity(String message, User postedBy, LocalDateTime postedOn) {
        this.message = message;
        this.postedBy = postedBy;
        this.postedOn = postedOn;
    }

    public String getMessage() {
        return message;
    }

    public User getPostedBy() {
        return postedBy;
    }

    public LocalDateTime getPostedOn() {
        return postedOn;
    }
}
