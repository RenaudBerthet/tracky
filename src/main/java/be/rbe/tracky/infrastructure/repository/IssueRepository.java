package be.rbe.tracky.infrastructure.repository;

import be.rbe.tracky.domain.Issue;

import java.util.List;

public interface IssueRepository {

    void save(Issue issue);

    void update(Issue issue);

    void delete(String issueID);

    Issue retrieve(String issueID);

    List<Issue> all();
}
