package be.rbe.tracky.domain.contracts;

public interface FromRestDTOMapper<Domain, DTO> {
    Domain toDomain(DTO DTO);
}
