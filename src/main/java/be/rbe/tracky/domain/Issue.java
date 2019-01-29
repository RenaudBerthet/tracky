package be.rbe.tracky.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Issue {
    private UUID issueID;
    private String title;
    private Severity severity;
    private List<Comment> comments;

    public Issue(UUID issueID, String title, Severity severity) {
        this.issueID = issueID;
        this.title = title;
        this.severity = severity;
        this.comments = new ArrayList<>();
    }

    public UUID getIssueID() {
        return issueID;
    }

    public String getTitle() {
        return title;
    }

    public Severity getSeverity() {
        return severity;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    @Override
    public String toString() {
        return "IssueEntity{" +
                "issueID=" + issueID +
                ", title='" + title + '\'' +
                ", severity=" + severity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return Objects.equals(issueID, issue.issueID) &&
                Objects.equals(title, issue.title) &&
                severity == issue.severity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueID, title, severity);
    }
}
