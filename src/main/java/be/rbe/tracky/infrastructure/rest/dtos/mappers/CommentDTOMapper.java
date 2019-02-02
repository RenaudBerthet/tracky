package be.rbe.tracky.infrastructure.rest.dtos.mappers;

import be.rbe.tracky.domain.Comment;
import be.rbe.tracky.domain.contracts.FromRestDTOMapper;
import be.rbe.tracky.infrastructure.rest.dtos.CommentDTO;

public class CommentDTOMapper implements FromRestDTOMapper<Comment, CommentDTO> {

    @Override
    public Comment toDomain(CommentDTO commentDTO) {
        return null;
    }

}
