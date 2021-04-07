package com.amit;

import static org.junit.Assert.*;

import com.amit.basics.Person;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.time.LocalDate;

/**
 * Unit test for the App.
 */
public class AppTest 
{
    /**
     * Test the Person class methods
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Person p1 = new Person("Amit","Vaswani", LocalDate.of(1989,9,18));
        Person p2 = new Person("Amit","Vaswani", LocalDate.of(1989,9,18));
        Person p3 = new Person("Kavya","Vaswani", LocalDate.of(1993,8,10));
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
        assertFalse(p1.equals(new Object()));
    }
}
