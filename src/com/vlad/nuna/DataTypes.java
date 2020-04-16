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
    public static void Exercise3() {
        // Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        if(num > 1000 || num < 0){
            System.out.println("The number should be between 0 and 1000. Try again \n");
            Exercise3();
            return;
        }

        int sum = 0;
        int initialNumber = num;
        while(1 <= num){
            sum += num % 10;
            num = num/10;
        }

        System.out.println("The sum of all digits in " + initialNumber + " is " + sum);

    }
}
