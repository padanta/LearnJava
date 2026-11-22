package com.lesson.fundamental;

import java.util.Scanner;

public class WhileAndDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int sum = 0;
//        while (sc.hasNextInt()) {
//            int n = sc.nextInt();
//            sum += n;
//        }
//        System.out.println(sum);
//
//        while(1){
//            System.out.println("d");
//        }

        long num = sc.nextLong();
        long result = 1;

        while (num < result) {
            System.out.println(result);
            result *= 2;
        }
    }
}
