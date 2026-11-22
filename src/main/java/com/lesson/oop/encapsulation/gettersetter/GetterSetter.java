package com.lesson.oop.encapsulation.gettersetter;

public class GetterSetter {
    public static void main(String[] args) {
        Car myCar = new Car();
        // myCar.model = "danta"; doesnt work!
        myCar.setModel("Toyota7890");
        myCar.setPrice(-1);
        System.out.println(myCar.getModel());
        System.out.println(myCar.getPrice());
    }
}
