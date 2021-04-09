package com.amit.basics;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String name;

    private String lastName;

    private LocalDate dateOfBirth;

    public Person(String name, String lastName, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person))
            return false;

        Person person = (Person) obj;
        if(this.name.equals(person.name)
                && this.lastName.equals(person.lastName)
                && this.dateOfBirth.equals(person.dateOfBirth) ) {
            return true;
        }
        else {
            return super.equals(obj);
        }
    }

    @Override
    public String toString() {
        return "Person ["
                +this.name
                +","
                +this.lastName
                +" "
                +this.dateOfBirth.toString()
                +"]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, dateOfBirth);
    }
}
