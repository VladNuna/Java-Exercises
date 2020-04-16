package com.vlad.nuna;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Arrays;
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

    public static void Exercise160() {
        // Write a Java program to find the k smallest elements in a given array. Elements in the array can be in any order.
        Integer arr[] = new Integer[]{1, 23, 111, 7, 32, 18, 100, 90, 144, 2, 2};
        int k = 3;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(k + " smallest elements of the said array are:");
        Arrays.sort(arr);
        for (int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void Exercise214() {
        /* 214. Write a Java program which solve the equation:
         * ax+by=c
         * dx+ey=f
         * Print the values of x, y where a, b, c, d, e and f are given.
         */
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Double> x = new ArrayDeque<Double>();
        ArrayDeque<Double> y = new ArrayDeque<Double>();
        System.out.println("Input the value of a, b, c, d, e, f:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        double t = (double)(d*c-a*f)/(d*b-a*e);
        double s = (double)(c-t*b)/a;
        x.push(s);
        y.push(t);
        int num = x.size();
        for(int i=0;i<num;i++){
            BigDecimal bdx = new BigDecimal(x.pollLast());
            BigDecimal bdy = new BigDecimal(y.pollLast());
            BigDecimal ansx = bdx.setScale(4, BigDecimal.ROUND_HALF_UP);
            BigDecimal ansy = bdy.setScale(4, BigDecimal.ROUND_HALF_UP);
            System.out.printf("%.3f", ansx.doubleValue());
            System.out.print(" ");
            System.out.printf("%.3f", ansy.doubleValue());
            System.out.println();
        }
    }
}
