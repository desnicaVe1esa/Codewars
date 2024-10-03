package kyu_7.fixme_get_full_name.java;

public class Dinglemouse {

    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return !firstName.isEmpty() && !lastName.isEmpty() ? firstName + " " + lastName : firstName + lastName;
    }

}
