package be.rbe.tracky.infrastructure.repository;

import java.util.UUID;

public interface IssueRepository {

    void save(UUID uuid, String issue);

    void update(UUID uuid, String issue);

    void delete(UUID uuid);

    String retrieve(UUID uuid);
}
