package com.lesson.oop.classes.constructor;

public class Constructors {
    public static void main(String[] args){
         class Patient{
            String name;
            int age;
            float height;

            Patient(String name, int age, float height){
                this.name = name;
                this.age = age;
                this.height = height;
            }
        }

        // default value if no constructor
        // Patient patient = new Patient();
        // System.out.println(patient);

        Patient patientA = new Patient("Danta", 24, 165.0f);
        Patient patientB = new Patient("Corvid", 24, 170.5f);

    }
}
