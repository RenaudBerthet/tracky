package be.rbe.tracky.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Issue {
    private String title;
    private Severity severity;
    private List<Comment> comments;

    public Issue(String title, Severity severity, List<Comment> comments) {
        this.title = title;
        this.severity = severity;
        this.comments = new ArrayList<>();
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return Objects.equals(title, issue.title) &&
                severity == issue.severity &&
                Objects.equals(comments, issue.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, severity, comments);
    }

    @Override
    public String toString() {
        return "IssueEntity{" +
                ", title='" + title + '\'' +
                ", severity=" + severity +
                '}';
    }


}
