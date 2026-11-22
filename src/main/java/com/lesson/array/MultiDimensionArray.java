package com.lesson.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] twoDimensionArray = new int[3][4];

//        for (int row = 0; row < twoDimensionArray.length; row++) {
//            for (int col = 0; col < twoDimensionArray[row].length; col++) {
//                twoDimensionArray[row][col] = 1;
//            }
//        }

//        for (int row = 0; row < twoDimensionArray.length; row++) {
//            for (int col = 0; col < twoDimensionArray[row].length; col++) {
//                twoDimensionArray[row][col] = sc.nextInt();
//            }
//        }

        for (int[] row : twoDimensionArray) {
            for (int col = 0; col < row.length; col++) {
                row[col] = sc.nextInt();
            }
            //Arrays.setAll(row, col -> sc.nextInt());
        }


        // print each row in the array
        System.out.println("With Standard for loop: ");
        for (int row = 0; row < twoDimensionArray.length; row++) {
            System.out.println(Arrays.toString(twoDimensionArray[row]));
        }

        System.out.println();

        System.out.println("With stream.forEach: ");
        Arrays.stream(twoDimensionArray).forEach(row -> System.out.println(Arrays.toString(row)));

        System.out.println();

        // print each row and each col in the array
        System.out.println("With Standard for loop: ");
        for (int row = 0; row < twoDimensionArray.length; row++) {
            for (int col = 0; col < twoDimensionArray[row].length; col++) {
                System.out.print(twoDimensionArray[row][col] + ", ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("With stream, inside a for loop: ");
        for (int[] row : twoDimensionArray) {
            Arrays.stream(row).forEach(col -> System.out.print(col + ", "));
            System.out.println();
        }
    }
}
