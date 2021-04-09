package com.amit.problems;

public class FactorialImpl implements Factorial{


    @Override
    public Long calculateFor(Long n) {
        if(n==1L) {
            return n;
        }
        else {
            n *= calculateFor(n-1);
        }
        return n;
    }
}
