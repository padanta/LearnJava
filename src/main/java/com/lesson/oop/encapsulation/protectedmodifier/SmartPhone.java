package com.lesson.oop.encapsulation.protectedmodifier;

public class SmartPhone extends MobileGadget{
    private Laptop connectedLaptop;

    public SmartPhone(){
        this.connectedLaptop = new Laptop();
    }

    private void sendInfoToLaptop(String data){
        printNotification("Sending data to Laptop: " + data);
        connectedLaptop.receiveInfo(data);
    }

    public static void main(String[] args) {
        Laptop lp = new Laptop();
        SmartPhone sm = new SmartPhone();
        sm.sendInfoToLaptop("hello");
    }
}
