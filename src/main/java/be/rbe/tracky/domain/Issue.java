package be.rbe.tracky.domain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Objects;

public class Issue {
    @Id
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Severity severity;

    public Issue(String title, Severity severity) {
        this.title = title;
        this.severity = severity;
    }

    public String getTitle() {
        return title;
    }

    public Severity getSeverity() {
        return severity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return Objects.equals(title, issue.title) &&
                severity == issue.severity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, severity);
    }

    @Override
    public String toString() {
        return "IssueEntity{" +
                ", title='" + title + '\'' +
                ", severity=" + severity +
                '}';
    }


}
