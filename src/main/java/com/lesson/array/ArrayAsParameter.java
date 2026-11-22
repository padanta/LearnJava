package com.lesson.array;

import java.util.Arrays;

public class ArrayAsParameter {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
        swapLastAndFirst(myArray);
        System.out.println(Arrays.toString(myArray));


        lengthOfNumber(1);
        lengthOfNumber(1, 2, 3);
        lengthOfNumber(new int[]{});
        lengthOfNumber(new int[]{1, 2});


        int[] numbers = {4, 5, 6};
        method(numbers); // doesnt change the numbers array
        System.out.println(Arrays.toString(numbers));
        numbers = method(numbers); // reassigning or changing each element 1 by 1 works for reference
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] swapLastAndFirst(int[] numArr) {
        if (numArr.length < 1) {
            throw new IllegalArgumentException("Not valid array!");
        }

        int temp = 0;
        temp = numArr[numArr.length - 1];
        numArr[numArr.length - 1] = numArr[0];
        numArr[0] = temp;
        return numArr;
    }

    // vararg ...
    // kind of like spread and rest operator in js
    private static void lengthOfNumber(int... numbers) {
        System.out.println(numbers.length);
    }

    public static int[] method(int[] array) {
        return array = new int[]{1, 2, 3};
    }

}

