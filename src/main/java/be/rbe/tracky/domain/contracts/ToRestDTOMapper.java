package be.rbe.tracky.domain.contracts;

public interface ToRestDTOMapper<Domain, DTO> {
    DTO toDTO(Domain domain);
}
