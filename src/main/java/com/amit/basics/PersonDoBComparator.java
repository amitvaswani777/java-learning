package com.amit.basics;

import java.util.Comparator;

public class PersonDoBComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getDateOfBirth().compareTo(person2.getDateOfBirth());
    }
}
