package org.example.interview.designpatterns.creational;

public class PrototypeDemo {

    public static void main(String[] args) {
        Shape circleProtoType = new Circle("Red");
        ShapeClient client = new ShapeClient(circleProtoType);
        Shape redCircle = client.createShape();
        redCircle.draw();
    }
}

//prototype interface
interface Shape{
    Shape clone(); // make a copy of itself
    void draw(); // draw the shape
}

// concrete prototype
class Circle implements Shape{
    private String color;
    public Circle(String color){
        this.color = color;
    }

    @Override
    public Shape clone(){
        return new Circle(this.color);
    }

    @Override
    public void draw(){
        System.out.println("drawing circle shape in "+color+" colors");
    }
}

class ShapeClient{
    private Shape shapePrototype;
    public ShapeClient(Shape shapePrototype){
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape(){
        return shapePrototype.clone();
    }
}


