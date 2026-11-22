package com.lesson.fundamental;

import com.lesson.array.Array;

public class ImportingClass {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        Array.printIntArr(nums); // method must be static, else it cant be imported in here
    }
}
