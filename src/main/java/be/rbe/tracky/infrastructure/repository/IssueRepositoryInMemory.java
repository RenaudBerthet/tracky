package be.rbe.tracky.infrastructure.repository;

import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Singleton
public class IssueRepositoryInMemory implements IssueRepository {


    private Map<UUID, String> issues;

    public IssueRepositoryInMemory() {
        this.issues = new HashMap<>();
    }

    @Override
    public void save(UUID uuid, String issue) {
        issues.put(uuid, issue);
    }

    @Override
    public String retrieve(UUID uuid) {
        return issues.get(uuid);
    }

    @Override
    public void update(UUID uuid, String issue) {
        issues.put(uuid, issue);
    }

    @Override
    public void delete(UUID uuid) {
        issues.remove(uuid);
    }

    @PreDestroy
    public void clear() {
        issues.clear();
    }
}
