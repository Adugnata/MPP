package lesson6.lap6app;

import java.io.Serializable;

public final class Author implements Serializable {
    private String firstName;
    private String lastName;

    public Author(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

