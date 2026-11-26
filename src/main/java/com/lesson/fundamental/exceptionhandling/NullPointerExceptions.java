package com.lesson.fundamental.exceptionhandling;

import java.util.Objects;

public class NullPointerExceptions {
    public static void main(String[] args) {
        String someStr = null;
        // int length = someStr.length(); // NPE

        int length = someStr != null ? someStr.length() : 0; // no NPE

        // when comparing string
        String str = null;

//        if(str.equals("abc")){ // NPE
//            System.out.println("The same");
//        }

        // use Yoda notation instead
        if("abc".equals(str)){ // no NPE
            System.out.println("The same");
        }

        // comparing multiple string
        String s1 = null;
        String s2 = null;

//        if(s1.equals(s2)){ // NPE
//            System.out.println("Both strings are the same");
//        }

        if(Objects.equals(s1, s2)){ // no NPE
            System.out.println("Both strings are the same");
        }
    }
}

// How to Avoid NPE:
// - for reference types, use a conditional statement to check whether the given variable is null before using it;
// - try to avoid assigning null to variables whenever possible;
// - use NPE-safe features from the standard library.
