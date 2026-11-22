package com.lesson.array;

import java.util.Arrays;
import java.util.Comparator;

// PLEASE GO BACK HERE AFTER YOU LEARN OOP !

// Custom class
class Student {

    int roll;
    String name;
    String address;

    Student(int roll, String name, String address) {

        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    // Print student details
    public String toString() {
        return roll + " " + name + " " + address;
    }
}

// Comparator to sort by roll number
class SortByRoll implements Comparator<Student> {

    public int compare(Student s1, Student s2) {

        return s1.roll - s2.roll;
    }
}

class Geeks {
    public static void main(String[] args) {

        Student[] students = {
                new Student(1, "Ram", "MP"),
                new Student(2, "Shyam", "UP"),
                new Student(3, "Hari", "Delhi")
        };

        // Sort using custom comparator
        Arrays.sort(students, new SortByRoll());

        // Print sorted students
        for (Student s : students)
            System.out.println(s);
    }
}