package com.amit;

import static org.junit.Assert.*;
import org.junit.Test;

public class BasicsTest {

    @Test
    public void testObjectClass() {
        Object obj = "Hello";
        String str2 = "Hello";
        assertTrue(obj.equals(str2));
    }
}
