package com.lesson.fundamental;

public class BreakContinue {
    public static void main(String[] args) {
        // break
//        for (int i = 0; i < 50; i++) {
//            for (int j = 0; j < 50; j++) {
//                if (i == j) {
//                    break;
//                }
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        System.out.println();

        // continue
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.print(i);
//        }
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i * i < 36) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
