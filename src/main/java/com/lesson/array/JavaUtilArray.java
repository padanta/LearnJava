package com.lesson.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class JavaUtilArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {3, 1, 2};


        // to string
        System.out.println("toString Method: " + Arrays.toString(arr1));

        // equals
        System.out.println("equals Method: " + Arrays.equals(arr1, arr2));

        // compare
        System.out.println("compare Method: " + Arrays.compare(arr1, arr3)); // {first array} is: -1 = less than, 0 = equal, 1 = greater than

        // copyOf
        int[] arr4 = Arrays.copyOf(arr1, 4); // if the newLength > the original arr length, 0 will be filled

        // copyOfRange
        int[] arr5 = Arrays.copyOfRange(arr1, 1, 4); // same as copy, but let you copy specifically from x index to y index

        System.out.println("copyOf Method: " + Arrays.toString(arr4));
        System.out.println("copyOfRange Method: " + Arrays.toString(arr5));

        // sort
        int[] arr6 = {5, 3, 1, 4, 2};
        Arrays.sort(arr6);
        System.out.println("sort method Asc: " + Arrays.toString(arr6));

        // sorting sub array
        int[] subArr = {5, 3, 1, 4, 2};
        Arrays.sort(subArr, 1, 3);
        System.out.println("sort method of sub array: " + Arrays.toString(subArr));

        // sort desc
        Integer[] descArr = {5, 3, 1, 4, 2}; // needs to Integer instead of int
        Arrays.sort(descArr, Collections.reverseOrder());
        System.out.println("sort method Desc: " + Arrays.toString(descArr));

        // binary search, must be sorted first
        System.out.println("binarySearch method: " + "at index " + Arrays.binarySearch(arr6, 5));

        // converting arrays

        // into list
        Integer[] arr7 = {4, 5, 6}; // doesnt accept primitive type, thus why using Byte, Integer, and such..
        List<Integer> listInt = Arrays.asList(arr7);
        System.out.println("asList method: " + listInt);

        // into stream
        int[] arr8 = {7, 8, 9};
        int max = Arrays.stream(arr8).max().getAsInt();

        System.out.println("stream.max method: " + max);

        // fill
        int[] numbers = {1, 2, 3, 4, 5};
        Arrays.fill(numbers, 1, 5, 10);

        System.out.println(Arrays.toString(numbers));

    }
}
