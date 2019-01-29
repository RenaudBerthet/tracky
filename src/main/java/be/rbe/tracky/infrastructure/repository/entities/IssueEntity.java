package be.rbe.tracky.infrastructure.repository.entities;


import be.rbe.tracky.domain.Severity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Table(name = "issues")
public class IssueEntity {
    @Id
    private UUID issueID;
    @Column(name = "title")
    private String title;
    @Enumerated(EnumType.STRING)
    private Severity severity;
    //todo add annotations
    private List<CommentEntity> commentEntities;
}
