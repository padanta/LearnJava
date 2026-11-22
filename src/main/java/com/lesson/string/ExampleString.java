package com.lesson.string;

import java.util.Scanner;

public class ExampleString {
    static void main(String[] args) {
        // ExampleString
        // example from docs
//        ExampleString input = "1 fish 2 fish red fish blue fish";
//        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//        System.out.println(s.next());
//        System.out.println(s.next());
//        System.out.println(s.next());
//        System.out.println(s.next());
//        s.close();


        Scanner scanner = new Scanner(System.in);
        // replacing a char -> b char
//        System.out.println(scanner.nextLine().toString().replace("a", "b"));

        //  reads a string and two integer numbers
        // input: java
        //        0 2
        // output: jav
        String text = scanner.next();
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        String finalResult = text.substring(firstNum, secondNum + 1);
        System.out.println(finalResult);

        scanner.close();


    }
}
