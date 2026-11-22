package com.lesson.oop.classes;

import java.util.Date;

public class StaticMember {
    public static void main(String[] args) {
        // static fields, think of it like a global variable that share the same value across all instances of class
        // it belongs to the class instead of the instance

        class User {
            public static Date lastCreated;
            public static final String TITLE = "Jr.";

            public User(){
                lastCreated = new Date();
            }
        }

        System.out.println(User.TITLE);
        System.out.println(User.lastCreated);

        User user1 = new User();
        System.out.println(User.lastCreated);

    }
}
