package be.rbe.tracky.domain.contracts;

import be.rbe.tracky.domain.Comment;
import be.rbe.tracky.domain.Issue;

import java.util.UUID;

public interface IssueRepository {

    void save(Issue issue);

    void addComment(UUID issueID, Comment comment);

    void update(Issue issue);

    void find(UUID issueID);

}
