package com.vlad.nuna;

import java.util.Scanner;

public class DataTypes {

    public DataTypes() {
    }

    public static void Exercise1(){
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Formulas:
        // F = (9C + (32*5)) / 5
        // C = (5(F -32)) / 9
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }


    public static void Exercise2() {
        // Write a Java program that reads a number in inches, converts it to meters.
        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
