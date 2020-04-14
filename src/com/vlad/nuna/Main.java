package com.vlad.nuna;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Exercise151();
    }

    public static void Exercise151(){
        // Write a Java program to find the value of specified expression.
        int intOutput = (101 + 0) / 3;
        double doubleOutput = 3.0e-6 * 10000000.1;
        boolean booleanOutput = true && true;

        System.out.println("(101 + 0) / 3)-> " + intOutput);
        System.out.println("(3.0e-6 * 10000000.1)-> " + doubleOutput);
        System.out.println("(true && true)-> " + booleanOutput);

        booleanOutput = false && true;
        System.out.println("(false && true)-> " + booleanOutput);

        booleanOutput = (false && false) || (true && true);
        System.out.println("((false && false) || (true && true))-> " + booleanOutput);

        booleanOutput = (false || false) && (true && true);
        System.out.println("(false || false) && (true && true)-> " + booleanOutput);
    }
}
