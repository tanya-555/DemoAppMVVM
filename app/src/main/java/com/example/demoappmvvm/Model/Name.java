package com.example.demoappmvvm.Model;

public class Name {
    String firstname;
    String lastname;

    public Name(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

}
