package com.amit;

import static org.junit.Assert.*;

import com.amit.basics.Person;
import com.amit.problems.Factorial;
import com.amit.problems.FactorialImpl;
import com.amit.problems.NumberSwaping;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.time.LocalDate;

/**
 * Unit test for the App.
 */
public class AppTest 
{
    Person p1;
    Person p2;
    Person p3;
    
    @Before
    public void beforeEach() {
        p1 = new Person("Amit","Vaswani", LocalDate.of(1989,9,18));
        p2 = new Person("Amit","Vaswani", LocalDate.of(1989,9,18));
        p3 = new Person("Kavya","Vaswani", LocalDate.of(1993,8,10));
    }
    /**
     * Test the Person class methods
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
        assertFalse(p1.equals(new Object()));
    }
    
    @Test
    public void testHashCode() {
       assertEquals("HashCode should be equal",p1.hashCode(),p2.hashCode());
    }

    @Test
    public void testDefaultFactorial() {
        assertEquals(Long.valueOf(24L), Factorial.of(4L));
    }

    @Test
    public void testFactorialImpl() {
        Factorial factorial = new FactorialImpl();
        assertEquals(Long.valueOf(24L),factorial.calculateFor(4L));
    }

    @Test
    public void testSwaping() {
        int a = 12;
        int b = 23;
        assertEquals("2312",new NumberSwaping().swap(a, b));
        assertEquals("2312",new NumberSwaping().swapWithoutTemp(a, b));
    }

}
