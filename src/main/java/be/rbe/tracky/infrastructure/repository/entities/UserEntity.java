package be.rbe.tracky.infrastructure.repository.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "users")
public class UserEntity {
    @Id
    private UUID userID;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lasttname")
    private String LastName;
}
