package be.rbe.tracky.domain.contracts;

public interface EntityConverter<Domain, Entity> {
    public Domain toDomain(Entity entity);

    public Entity toEntity(Domain domain);
}
