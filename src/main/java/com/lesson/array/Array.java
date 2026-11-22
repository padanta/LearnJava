package com.lesson.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /* array initialization
        int[] arr = {1, 2, 3, 4};
        int[] numbers = new int[3];
        char[] characters = new char[5];
        */

        /* #1 of adding elements to an array
        It takes an array, start index, end index (exclusive) and the value for filling the array
        Arrays.fill(characters, 0, 1, 'A');
        Arrays.fill(characters, 1, 2, 'B');
        Arrays.fill(characters, 1, 2, 'B');
        */

        //Arrays.sort(numbers, 1, numbers.length);

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] numbers = new int[len];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        //System.out.println(Arrays.toString(numbers));

        /* iteratin over an array: method #1
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
         */

        // iteratin over an array: method #2 for-each
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printIntArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
