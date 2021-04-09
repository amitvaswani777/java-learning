package com.amit.problems;

@FunctionalInterface
public interface Factorial {
       Long calculateFor(Long n);

       static Long of(Long n) {
           long result = 1L;
           for(long i=n; i>=1; i--) {
               result *=i;
           }
           return result;
       }
}
