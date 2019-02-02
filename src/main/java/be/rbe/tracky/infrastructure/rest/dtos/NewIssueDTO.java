package be.rbe.tracky.infrastructure.rest.dtos;

import java.util.List;

public class NewIssueDTO {
    public String name;
    public String severity;
    public List<CommentDTO> comments;
}
