package com.amit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexTest {

    @Test
    public void testEmail() {
        Pattern email = Pattern.compile("[a-zA-Z]+[.]*[a-zA-Z]+@[a-zA-Z]+[.]*[a-zA-Z]+");
        Matcher matcher = email.matcher("amit.vaswani@aol.com");
        Assert.assertTrue(matcher.matches());
    }
}
