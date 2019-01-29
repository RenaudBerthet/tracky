package be.rbe.tracky.domain.contracts;

public interface RestDTOConverter<Domain, DTO> {
    public Domain toDomain(DTO DTO);

    public DTO toDTO(Domain domain);
}
