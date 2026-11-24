package com.lesson.oop.classes;
import java.util.Date;

public class InitializationBlock {
    public static void main(String[] args) {
        InstanceInitializationBlock intArray = new InstanceInitializationBlock();
        intArray.printArray();
    }
}

class StaticInitializationBlock {
    private static String stringField;
    private static Date dateField;
    private static final String A_STRING_FIELD;

    // it's impossible to access instance fields and methods in a static block.
    // A static initialization block is executed once for the whole class, not for each instance of the class.
    // it's possible to call static method inside
    static {
        stringField = "Something";
        dateField = new Date();
        A_STRING_FIELD = "Fixed String";
    }

    private static String emptyString(){
        return "empty";
    }
}

// if we need to perform more complex logic before a constructor is invoked,
// it's convenient to write an instance initialization block
class InstanceInitializationBlock{
    private int[] array;


    // you can access instance fields inside an instance initialization block
    {
        System.out.println("Before the constructor");

        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
    }

    void printArray(){
        for (int num: array){
            System.out.printf("%d ", num);
        }
    }
}