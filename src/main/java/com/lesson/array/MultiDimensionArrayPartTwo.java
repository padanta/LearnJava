package com.lesson.array;

import java.util.Arrays;

public class MultiDimensionArrayPartTwo {
    public static void main(String[] args) {
        int[][][] threeDimensionArray = new int[2][3][4];
        int element = 0;

        for (int i = 0; i < threeDimensionArray.length; i++) {
            for (int j = 0; j < threeDimensionArray[i].length; j++) {
                for (int k = 0; k < threeDimensionArray[i][j].length; k++) {
                    threeDimensionArray[i][j][k] = element;
                }
                element++;
            }
        }

        // print all arrays in threeDimensionArray
        for (int i = 0; i < threeDimensionArray.length; i++) {
            for (int j = 0; j < threeDimensionArray[i].length; j++) {
                System.out.print(Arrays.toString(threeDimensionArray[i][j]) + " ");
            }
            System.out.println();
        }

        // print all element in threeDimensionArray
        for (int i = 0; i < threeDimensionArray.length; i++) {
            for (int j = 0; j < threeDimensionArray[i].length; j++) {
                for (int k = 0; k < threeDimensionArray[i][j].length; k++) {
                    System.out.print(threeDimensionArray[i][j][k]);
                }
                System.out.print(", ");
            }
            System.out.println();
        }


    }

}
