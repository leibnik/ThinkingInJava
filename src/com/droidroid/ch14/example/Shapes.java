package com.droidroid.ch14.example;

import java.util.Arrays;
import java.util.List;

import static com.droidroid.utils.Print.print;

/**
 * Created by leibnik on 16-11-4.
 */
abstract class Shape {
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}
class Circle extends Shape{

    @Override
    public String toString() {
        return "Circle";
    }
}
class Square extends Shape{

    @Override
    public String toString() {
        return "Square";
    }
}
class Triangle extends Shape{

    @Override
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape{

    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes{
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(),
                new Square(), new Triangle(),new Rhomboid());
        for (Shape shape :
                shapeList) {
            shape.draw();
            rotate(shape);
        }
        Shape shape = shapeList.get(shapeList.size() - 1);
        Rhomboid rhomboid = (Rhomboid) shape;
        // Circle circle = (Circle) shape; // ClassCastException

        if (shape instanceof Circle){
            Circle circle = (Circle)shape;
            print("the shape instance of Circle");
        }

        if (shape instanceof Rhomboid){
            Rhomboid rhomboid2 = (Rhomboid) shape;
            print("the shape instance of Rhomboid");
        }
    }

    public static void rotate(Shape shape){
        if (shape instanceof Circle){
            print("rotate...");
        }
    }
}
