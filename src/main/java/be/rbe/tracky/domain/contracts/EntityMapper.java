package be.rbe.tracky.domain.contracts;

public interface EntityMapper<Domain, Entity> {
    Domain toDomain(Entity entity);

    Entity toEntity(Domain domain);
}
