package be.rbe.tracky.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comment {

    private String message;
    private User postedBy;
    private LocalDateTime postedOn;

    public Comment(String message, User postedBy, LocalDateTime postedOn) {
        this.message = message;
        this.postedBy = postedBy;
        this.postedOn = postedOn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(User postedBy) {
        this.postedBy = postedBy;
    }

    public LocalDateTime getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(LocalDateTime postedOn) {
        this.postedOn = postedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(message, comment.message) &&
                Objects.equals(postedBy, comment.postedBy) &&
                Objects.equals(postedOn, comment.postedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, postedBy, postedOn);
    }

    @Override
    public String toString() {
        return "CommentEntity{" +
                "message='" + message + '\'' +
                ", postedBy=" + postedBy +
                ", postedOn=" + postedOn +
                '}';
    }
}
