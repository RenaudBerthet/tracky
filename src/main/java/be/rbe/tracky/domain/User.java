package be.rbe.tracky.domain;

import java.util.Objects;
import java.util.UUID;

public class User {
    private UUID userID;
    private String firstName;
    private String LastName;

    public User(UUID userID, String firstName, String lastName) {
        this.userID = userID;
        this.firstName = firstName;
        LastName = lastName;
    }

    public UUID getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userID, user.userID) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(LastName, user.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, firstName, LastName);
    }
}
