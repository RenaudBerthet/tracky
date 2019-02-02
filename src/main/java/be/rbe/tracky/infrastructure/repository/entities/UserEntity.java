package be.rbe.tracky.infrastructure.repository.entities;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userID;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lasttname")
    private String LastName;

    public UserEntity(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }


}
