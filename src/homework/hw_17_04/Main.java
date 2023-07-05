package homework.hw_17_04;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return radius * radius;
    }
}

class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea(){
        return length * width;
    }
}

class Triangle extends Shape{
    double base;
    double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea(){
        return 0.5 * base * height;
    }
}

class ShapeCalculator{
    public static double calculateTotalArea(Shape[] shapes){
        double totalArea = 0;
        for (Shape shape : shapes){
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

public class Main{
    public static void main(String[] args){
        Shape[] shapes = {new Circle(5), new Rectangle(12,8), new Triangle(4,5)};
        double totalArea = ShapeCalculator.calculateTotalArea(shapes);
        System.out.println(totalArea);
    }
}
