package com.lesson.oop.abstraction;

public class AnotherInterfaceExample {
    public static void main(String[] args) {
        DrawingTool pencil = new Pencil();
        DrawingTool pen = new Pen();
        Curve someCurve = new Curve();

        // either this
        pen.draw(someCurve);

        // or this polymorphism
        drawCurve(pencil, someCurve);
    }

    static void drawCurve(DrawingTool tool, Curve curve){
        System.out.println("Drawing a curve " + curve + " using a " + tool);
    }
}

// lets say Curve is a class that represent some curve
class Curve{
    // fields, constructor, getter setter...

}

interface DrawingTool {
    void draw(Curve curve);
}

// without an interface its not clear that Pencil and Pen are able to draw or not
//class Pencil{
//    public void draw(Curve curve){
//        // different implementation
//    }
//}

//class Pen{
//    public void draw(Curve curve){
//        // different implementation
//    }
//}

// with an interface, everything is much crystal clear. We know for sure Pencil and Pen can draw
class Pencil implements DrawingTool{
    public void draw(Curve curve){
        // different implementation
    }

}

class Pen implements DrawingTool{
    public void draw(Curve curve){
        // different implementation
    }
}