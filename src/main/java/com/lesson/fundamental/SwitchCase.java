package com.lesson.fundamental;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // switch statement old
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not Allowed! only 0-3");
                break;
        }

        // switch statement new
        // performs action, produce no value
        int numb = sc.nextInt();
        switch (numb) {
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            default -> throw new IllegalStateException("only 1-3");
        }

        // switch expression
        // produce value, can be assign or return. Must contain default
        // "exhaustive" = doesn't cover every possible case
        int number = sc.nextInt();
        String spelling = switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> throw new IllegalStateException("Invalid NUMBER!");
        };
        System.out.println(spelling);
    }



}

