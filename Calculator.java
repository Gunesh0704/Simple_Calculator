package com.company;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // To Scan The Inputs............
        char maths;
        double num1, num2, result;

        // For User Inputs
        System.out.println("This Calculator is Created by Gunesh Mohane");
        System.out.println(" Choose + , - , * , /");
        maths = scan.next().charAt(0);
        System.out.print(" Enter 1st Number :- ");
        num1 = scan.nextDouble();
        System.out.print(" Enter 2nd Number :- ");
        num2 = scan.nextDouble();
        System.out.println("Chose your Operator");

        // For Calculations
        switch (maths){
            // performs addition between numbers
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }


        scan.close();
    }
}