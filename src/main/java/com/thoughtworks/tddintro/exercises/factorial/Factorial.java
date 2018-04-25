package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int n) {
        if(n < 0)
            throw new IllegalArgumentException("Please enter a positive integer.");
        else if(n == 0){
            return 1;
        }
        else{
            for(int i = n-1; i > 0; i--){
                n *= i;
            }
            return n;
        }
    }
}
