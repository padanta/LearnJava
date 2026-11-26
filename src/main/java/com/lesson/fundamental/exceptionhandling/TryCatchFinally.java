package com.lesson.fundamental.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// The best approach to handle an exception is
// to do it in a method that has sufficient information to make the correct decision based on this exception.
public class TryCatchFinally {
    public static void main(String[] args) {
        // try-catch
        System.out.println("Before Try Catch"); // will be printed
        try {
            System.out.println("Inside Try block before exception"); // will be printed
            System.out.println(2 / 0); // exception occured
            System.out.println("Inside Try block after the exception"); // will not be printed
        } catch (Exception e) {
            System.out.println("Inside catch block: " + e.getMessage()); // will be printed
        }
        System.out.println("After the Try Catch"); // will be printed

        System.out.println();

        // multi-catch
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            String b = sc.next();
            System.out.println(a / Integer.parseInt(b));
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number!");
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // finally, will always be executed whether an exception occurred or not
        System.out.println("Before Try Catch"); // will be printed
        try {
            System.out.println("Inside try block before exception"); // will be printed
            System.out.println(10 / 0); // exception occured
            System.out.println("Inside try block after the exception"); // will not be printed
        } catch (Exception e) {
            System.out.println("Inside catch block: " + e.getMessage()); // will be printed
        } finally {
            System.out.println("Inside finally block"); // will be printed
        }
        System.out.println("After the Try Catch"); // will be printed
    }
}
