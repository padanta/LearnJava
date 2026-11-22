package com.lesson.oop.encapsulation.gettersetter;

public class Car {
    private String model;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price > 0){
            this.price = price;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.length() > 10){
            throw new IllegalArgumentException("Must be less than 10 character");
        } else {
            this.model = model;
        }
    }
}