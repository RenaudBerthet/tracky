package be.rbe.tracky.infrastructure.repository.entities;


import be.rbe.tracky.domain.Severity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Table(name = "issues")
public class IssueEntity {
    @Id
    private UUID issueID;
    @Column(name = "title")
    private String title;
    @Enumerated(EnumType.STRING)
    private Severity severity;
    //todo add annotations
    private List<CommentEntity> commentEntities;

    public IssueEntity(String title, Severity severity, List<CommentEntity> commentEntities) {
        this.title = title;
        this.severity = severity;
        this.commentEntities = commentEntities;
    }

    public String getTitle() {
        return title;
    }

    public Severity getSeverity() {
        return severity;
    }

    public List<CommentEntity> getCommentEntities() {
        return commentEntities;
    }

    public void addComment(CommentEntity comment) {
        commentEntities.add(comment);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public void setCommentEntities(List<CommentEntity> commentEntities) {
        this.commentEntities = commentEntities;
    }
}
