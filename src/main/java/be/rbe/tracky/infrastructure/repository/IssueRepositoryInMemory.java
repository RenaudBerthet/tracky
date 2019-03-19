package be.rbe.tracky.infrastructure.repository;

import be.rbe.tracky.domain.Issue;

import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Singleton
public class IssueRepositoryInMemory implements IssueRepository {

    private Map<String, String> issues;

    public IssueRepositoryInMemory() {
        this.issues = new ConcurrentHashMap<>();
    }

    @Override
    public void save(Issue issue) {

    }

    @Override
    public void update(Issue issue) {

    }

    @Override
    public void delete(String uuid) {
        issues.remove(uuid);
    }

    @Override
    public Issue retrieve(String issueID) {
        return null;
    }

    @Override
    public List<Issue> all() {
        return null;
    }

    @PreDestroy
    public void clear() {
        issues.clear();
    }
}
