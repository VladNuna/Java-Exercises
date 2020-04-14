package com.vlad.nuna;

import java.util.Scanner;

public class Basic {
    public Basic() {
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


    public static void Exercise152() {
        // Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = in.nextInt();
        System.out.print("Input third number: ");
        int thirdNumber = in.nextInt();
        System.out.print("Input fourth number: ");
        int fourthNumber = in.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == fourthNumber)
        {
            System.out.println("Numbers are equal.");
        }
        else
        {
            System.out.println("Numbers are not equal!");
        }
    }


    public static void Exercise153() {
        // Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double firstNumber = in.nextDouble();
        System.out.print("Input second number: ");
        double secondNumber = in.nextDouble();
        System.out.println(firstNumber > 0 && firstNumber < 1 && secondNumber > 0 && secondNumber < 1);
    }
}
